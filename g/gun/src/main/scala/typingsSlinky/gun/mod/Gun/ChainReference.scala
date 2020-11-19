package typingsSlinky.gun.mod.Gun

import typingsSlinky.gun.anon.Ack
import typingsSlinky.gun.anon.Change
import typingsSlinky.gun.anon.ErrString
import typingsSlinky.gun.anon.Pub
import typingsSlinky.gun.anon.Put
import typingsSlinky.gun.anon.Recordgunrootidbackontagg
import typingsSlinky.gun.anon.Recordofftonexttheonasbac
import typingsSlinky.gun.anon.SessionStorage
import typingsSlinky.gun.anon.Wait
import typingsSlinky.gun.anon.`0`
import typingsSlinky.gun.gunBooleans.`false`
import typingsSlinky.gun.gunStrings.pre_root
import typingsSlinky.gun.gunStrings.root
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChainReference[DataType, ReferenceKey, IsTop /* <: pre_root | root | `false` */] extends js.Object {
  
  /**
    * Authenticates a user, previously created via User.create.
    * @param alias Username or Alias which can be used to find a user.
    * @param pass Passphrase for the user
    * @param cb Callback that is to be called upon authentication of the user.
    * @param opt Option Object containing options for authentiaction. (In gun options are added at end of syntax. opt is rarely used, hence is added at the end.)
    */
  def auth(alias: String, pass: String): ChainReference[_, _, `false`] = js.native
  def auth(alias: String, pass: String, cb: js.UndefOr[scala.Nothing], opt: js.Object): ChainReference[_, _, `false`] = js.native
  def auth(alias: String, pass: String, cb: js.Function1[/* ack */ Ack | ErrString, Unit]): ChainReference[_, _, `false`] = js.native
  def auth(alias: String, pass: String, cb: js.Function1[/* ack */ Ack | ErrString, Unit], opt: js.Object): ChainReference[_, _, `false`] = js.native
  
  /**
    * Move up to the parent context on the chain.
    *
    * Every time a new chain is created, a reference to the old context is kept to go back to.
    * @param amount The number of times you want to go back up the chain.
    * `-1` or `Infinity` will take you to the root.
    * @returns Impossible to determinate final type. You must cast it by yourself.
    */
  def back(): ChainReference[_, _, `false`] = js.native
  def back(amount: Double): ChainReference[_, _, `false`] = js.native
  
  /**
    * bye lets you change data after that browser peer disconnects.
    * This is useful for games and status messages,
    * that if a player leaves you can remove them from the game or set a user's status to "away".
    *
    * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/bye.js')` or
    * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/bye.js"></script>`!
    */
  var bye: js.UndefOr[js.Function0[Put[DataType]]] = js.native
  
  //#endregion
  //#region User
  /**
    * Creates a new user and calls callback upon completion.
    * @param alias Username or Alias which can be used to find a user.
    * @param pass Passphrase that will be extended with PBKDF2 to make it a secure way to login.
    * @param cb Callback that is to be called upon creation of the user.
    * @param opt Option Object containing options for creation. (In gun options are added at end of syntax. opt is rarely used, hence is added at the end.)
    */
  def create(alias: String, pass: String): ChainReference[_, _, `false`] = js.native
  def create(alias: String, pass: String, cb: js.UndefOr[scala.Nothing], opt: js.Object): ChainReference[_, _, `false`] = js.native
  def create(alias: String, pass: String, cb: js.Function1[/* ack */ Pub | ErrString, Unit]): ChainReference[_, _, `false`] = js.native
  def create(alias: String, pass: String, cb: js.Function1[/* ack */ Pub | ErrString, Unit], opt: js.Object): ChainReference[_, _, `false`] = js.native
  
  /**
    * Deletes a user from the current gun instance and propagates the delete to other peers.
    * @param alias Username or alias.
    * @param pass Passphrase for the user.
    * @param cb Callback that is called when the user was successfully deleted.
    */
  def delete(alias: String, pass: String): js.Promise[Unit] = js.native
  def delete(alias: String, pass: String, cb: js.Function1[/* ack */ `0`, Unit]): js.Promise[Unit] = js.native
  
  /**
    * Where to read data from.
    * @param key The key is the ID or property name of the data that you saved from earlier
    *  (or that will be saved later).
    * * Note that if you use .put at any depth after a get it first reads the data and then writes, merging the data as a partial update.
    * @param callback You will usually be using gun.on or gun.once to actually retrieve your data,
    * not this callback (it is intended for more low level control, for module and extensions).
    *
    * **Avoid use callback. The type in the document may be wrong.**
    *
    * **Here the type of callback respect to the actual behavior**
    */
  def get[K /* <: /* keyof DataType */ String */](key: K): ChainReference[
    /* import warning: importer.ImportType#apply Failed type conversion: DataType[K] */ js.Any, 
    K, 
    `false` | root
  ] = js.native
  def get[K /* <: /* keyof DataType */ String */](
    key: K,
    callback: js.Function2[/* paramA */ Recordgunrootidbackontagg, /* paramB */ Recordofftonexttheonasbac, Unit]
  ): ChainReference[
    /* import warning: importer.ImportType#apply Failed type conversion: DataType[K] */ js.Any, 
    K, 
    `false` | root
  ] = js.native
  
  /**
    * Say you save some data, but want to do something with it later, like expire it or refresh it.
    * Well, then `later` is for you! You could use this to easily implement a TTL or similar behavior.
    *
    * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/later.js')` or
    * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/later.js"></script>`!
    */
  var later: js.UndefOr[
    js.Function2[
      /* callback */ js.ThisFunction2[
        /* this */ ChainReference[DataType, ReferenceKey, `false`], 
        /* data */ ArrayAsRecord[DataType], 
        /* key */ ReferenceKey, 
        Unit
      ], 
      /* seconds */ Double, 
      ChainReference[DataType, ReferenceKey, `false`]
    ]
  ] = js.native
  
  /**
    * Log out currently authenticated user. Parameters are unused in the current implementation.
    * @param opt unused in current implementation.
    * @param cb unused in current implementation.
    */
  def leave(): ChainReference[_, _, `false`] = js.native
  def leave(opt: js.UndefOr[scala.Nothing], cb: scala.Nothing): ChainReference[_, _, `false`] = js.native
  def leave(opt: scala.Nothing): ChainReference[_, _, `false`] = js.native
  def leave(opt: scala.Nothing, cb: scala.Nothing): ChainReference[_, _, `false`] = js.native
  
  /**
    * Loads the full object once. It is the same as `open` but with the behavior of `once`.
    *
    * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/load.js')` or
    * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/load.js"></script>`!
    */
  var load: js.UndefOr[
    js.Function1[
      /* callback */ js.Function1[/* data */ ArrayAsRecord[DataType], Unit], 
      ChainReference[DataType, ReferenceKey, `false`]
    ]
  ] = js.native
  
  /**
    * Map iterates over each property and item on a node, passing it down the chain,
    * behaving like a forEach on your data.
    * It also subscribes to every item as well and listens for newly inserted items.
    */
  def map(): ChainReference[ArrayOf[DataType], ReferenceKey, `false`] = js.native
  def map(
    callback: js.Function2[/* value */ ArrayOf[DataType], /* key */ DataType, js.UndefOr[ArrayOf[DataType]]]
  ): ChainReference[ArrayOf[DataType], ReferenceKey, `false`] = js.native
  
  /**
    * Handle cases where data can't be found.
    *
    * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/not.js')` or
    * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/not.js"></script>`!
    */
  var not: js.UndefOr[
    js.Function1[
      /* callback */ js.Function1[/* key */ ReferenceKey, Unit], 
      ChainReference[DataType, ReferenceKey, `false`]
    ]
  ] = js.native
  
  /**
    * Undocumented, but extremely useful and mentioned in the document
    *
    * Remove **all** listener on this node.
    */
  def off(): Unit = js.native
  
  // Main API
  /**
    * Subscribe to updates and changes on a node or property in realtime.
    * @param option Currently, the only option is to filter out old data, and just be given the changes.
    * If you're listening to a node with 100 fields, and just one changes,
    * you'll instead be passed a node with a single property representing that change rather than the full node every time.
    * @param callback
    * Once initially and whenever the property or node you're focused on changes, this callback is immediately fired with the data as it is at that point in time.
    *
    * Since gun streams data, the callback will probably be called multiple times as new chunk comes in.
    * To remove a listener call .off() on the same property or node.
    */
  def on(
    callback: js.Function2[
      /* data */ DisallowPrimitives[IsTop, AlwaysDisallowedType[ArrayAsRecord[DataType]]], 
      /* key */ ReferenceKey, 
      Unit
    ]
  ): ChainReference[DataType, ReferenceKey, `false`] = js.native
  def on(
    callback: js.Function2[
      /* data */ DisallowPrimitives[IsTop, AlwaysDisallowedType[ArrayAsRecord[DataType]]], 
      /* key */ ReferenceKey, 
      Unit
    ],
    option: Boolean
  ): ChainReference[DataType, ReferenceKey, `false`] = js.native
  def on(
    callback: js.Function2[
      /* data */ DisallowPrimitives[IsTop, AlwaysDisallowedType[ArrayAsRecord[DataType]]], 
      /* key */ ReferenceKey, 
      Unit
    ],
    option: Change
  ): ChainReference[DataType, ReferenceKey, `false`] = js.native
  
  /**
    * Get the current data without subscribing to updates. Or `undefined` if it cannot be found.
    * @returns In the document, it said the return value may change in the future. Don't rely on it.
    */
  def once(): ChainReference[DataType, ReferenceKey, `false`] = js.native
  def once(callback: js.UndefOr[scala.Nothing], option: Wait): ChainReference[DataType, ReferenceKey, `false`] = js.native
  def once(
    callback: js.Function2[
      /* data */ js.UndefOr[DisallowPrimitives[IsTop, AlwaysDisallowedType[ArrayAsRecord[DataType]]]], 
      /* key */ ReferenceKey, 
      Unit
    ]
  ): ChainReference[DataType, ReferenceKey, `false`] = js.native
  def once(
    callback: js.Function2[
      /* data */ js.UndefOr[DisallowPrimitives[IsTop, AlwaysDisallowedType[ArrayAsRecord[DataType]]]], 
      /* key */ ReferenceKey, 
      Unit
    ],
    option: Wait
  ): ChainReference[DataType, ReferenceKey, `false`] = js.native
  
  /**
    * Open behaves very similarly to gun.on, except it gives you the **full depth of a document** on every update.
    * It also works with graphs, tables, or other data structures. Think of it as opening up a live connection to a document.
    *
    * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/open.js')` or
    * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/open.js"></script>`!
    */
  var open: js.UndefOr[
    js.Function1[
      /* callback */ js.Function1[/* data */ ArrayAsRecord[DataType], Unit], 
      ChainReference[DataType, ReferenceKey, `false`]
    ]
  ] = js.native
  
  /**
    * Change the configuration of the gun database instance.
    * @param options The options argument is the same object you pass to the constructor.
    *
    * The options's properties replace those in the instance's configuration but options.peers are **added** to peers known to the gun instance.
    * @returns No mention in the document, behavior as `ChainReference<DataType, ReferenceKey>`
    */
  def opt(options: ConstructorOptions): ChainReference[DataType, ReferenceKey, `false`] = js.native
  
  /**
    * Returns the key pair in the form of an object as below.
    */
  def pair(): CryptoKeyPair = js.native
  
  //#endregion
  //#region Extended API
  /**
    *
    * Path does the same thing as `.get` but has some conveniences built in.
    * @deprecated This is not friendly with type system.
    *
    * **Warning**: This extension was removed from core, you probably shouldn't be using it!
    *
    * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/path.js')` or
    * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/path.js"></script>`!
    */
  var path: js.UndefOr[
    js.Function1[/* path */ String | js.Array[String], ChainReference[_, _, `false`]]
  ] = js.native
  
  /**
    * Returns a promise for you to use.
    *
    * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/then.js')` or
    *  `<script src="https://cdn.jsdelivr.net/npm/gun/lib/then.js"></script>`!
    */
  var promise: js.UndefOr[
    js.Function1[
      /* onfulfilled */ js.UndefOr[
        js.Function1[
          /* value */ typingsSlinky.gun.anon.Gun[DataType, ReferenceKey], 
          (typingsSlinky.gun.anon.Gun[DataType, ReferenceKey]) | (js.Thenable[typingsSlinky.gun.anon.Gun[DataType, ReferenceKey]])
        ]
      ], 
      js.Promise[typingsSlinky.gun.anon.Gun[DataType, ReferenceKey]]
    ]
  ] = js.native
  
  //#region API
  /**
    * Save data into gun, syncing it with your connected peers.
    *
    * * You cannot save primitive values at the root level.
    *
    * @param data You do not need to re-save the entire object every time,
    * gun will automatically merge your data into what already exists as a "partial" update.
    *
    * * `undefined`, `NaN`, `Infinity`, `array`, will be rejected.
    * * Traditional arrays are dangerous in real-time apps. Use `gun.set` instead.
    *
    * @param callback invoked on each acknowledgment
    */
  def put(data: Partial[AlwaysDisallowedType[DisallowPrimitives[IsTop, DisallowArray[DataType]]]]): ChainReference[DataType, ReferenceKey, IsTop] = js.native
  def put(
    data: Partial[AlwaysDisallowedType[DisallowPrimitives[IsTop, DisallowArray[DataType]]]],
    callback: AckCallback
  ): ChainReference[DataType, ReferenceKey, IsTop] = js.native
  
  /**
    * Recall saves a users credentials in sessionStorage of the browser. As long as the tab of your app is not closed the user stays logged in, even through page refreshes and reloads.
    * @param opt option object If you want to use browser sessionStorage to allow users to stay logged in as long as the session is open, set opt.sessionStorage to true
    * @param cb internally the callback is passed on to the user.auth function to logged the user back in. Refer to user.auth for callback documentation.
    */
  def recall(): ChainReference[_, _, `false`] = js.native
  def recall(
    opt: js.UndefOr[scala.Nothing],
    cb: /* import warning: importer.ImportType#apply Failed type conversion: gun.gun.Gun.Parameters<(alias : string, pass : string, cb : (ack : gun.anon.Ack | gun.anon.ErrString): void | undefined, opt : {} | undefined): gun.gun.Gun.ChainReference<any, any, false>>[2] */ js.Any
  ): ChainReference[_, _, `false`] = js.native
  def recall(opt: SessionStorage): ChainReference[_, _, `false`] = js.native
  def recall(
    opt: SessionStorage,
    cb: /* import warning: importer.ImportType#apply Failed type conversion: gun.gun.Gun.Parameters<(alias : string, pass : string, cb : (ack : gun.anon.Ack | gun.anon.ErrString): void | undefined, opt : {} | undefined): gun.gun.Gun.ChainReference<any, any, false>>[2] */ js.Any
  ): ChainReference[_, _, `false`] = js.native
  
  /**
    * **.set does not means 'set data', it means a Mathematical Set**
    *
    * Add a unique item to an unordered list.
    * `gun.set` works like a mathematical set, where each item in the list is unique.
    * If the item is added twice, it will be merged.
    *
    * **This means only objects, for now, are supported.**
    */
  def set(data: AlwaysDisallowedType[ArrayOf[DataType]]): ChainReference[ArrayOf[DataType], _, `false`] = js.native
  def set(data: AlwaysDisallowedType[ArrayOf[DataType]], callback: AckCallback): ChainReference[ArrayOf[DataType], _, `false`] = js.native
  
  /**
    * Returns a promise for you to use.
    *
    * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/then.js')` or
    * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/then.js"></script>`!
    */
  var `then`: js.UndefOr[
    js.Function1[
      /* onfulfilled */ js.UndefOr[
        js.Function1[
          /* value */ ArrayAsRecord[DataType], 
          ArrayAsRecord[DataType] | js.Thenable[ArrayAsRecord[DataType]]
        ]
      ], 
      js.Promise[ArrayAsRecord[DataType]]
    ]
  ] = js.native
  
  /**
    * Subscribes to all future events that occur on the Timegraph and retrieve a specified number of old events
    *
    * **Warning**: The Timegraph extension isn't required by default, you would need to include at "gun/lib/time.js"
    */
  /** Pushes data to a Timegraph with it's time set to Gun.state()'s time */
  var time: (js.UndefOr[
    js.Function2[
      /* callback */ js.Function3[/* data */ ArrayOf[DataType], /* key */ ReferenceKey, /* time */ Double, Unit], 
      /* alsoReceiveNOldEvents */ js.UndefOr[Double], 
      ChainReference[DataType, ReferenceKey, `false`]
    ]
  ]) with (js.UndefOr[js.Function1[/* data */ ArrayOf[DataType], Unit]]) = js.native
  
  /**
    * After you save some data in an unordered list, you may need to remove it.
    *
    * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/unset.js')` or
    * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/unset.js"></script>`!
    */
  var unset: js.UndefOr[
    js.Function1[/* data */ ArrayOf[DataType], ChainReference[DataType, ReferenceKey, `false`]]
  ] = js.native
  
  /**
    * @param publicKey If you know a users publicKey you can get their user graph and see any unencrypted data they may have stored there.
    */
  def user(): ChainReference[_, _, `false`] = js.native
  def user(publicKey: String): ChainReference[_, _, `false`] = js.native
}
