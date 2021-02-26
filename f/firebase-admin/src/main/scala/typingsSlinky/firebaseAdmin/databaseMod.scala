package typingsSlinky.firebaseAdmin

import typingsSlinky.firebaseAdmin.firebaseNamespaceApiMod.app.App
import typingsSlinky.firebaseDatabaseTypes.mod.FirebaseDatabase
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseMod {
  
  object database {
    
    @JSImport("firebase-admin/lib/database", "database")
    @js.native
    def apply(): Database = js.native
    @JSImport("firebase-admin/lib/database", "database")
    @js.native
    def apply(app: App): Database = js.native
    
    /**
      * [`ServerValue`](https://firebase.google.com/docs/reference/js/firebase.database.ServerValue)
      * module from the `@firebase/database` package.
      */
    @JSImport("firebase-admin/lib/database", "database.ServerValue")
    @js.native
    val ServerValue: typingsSlinky.firebaseDatabaseTypes.mod.ServerValue = js.native
    
    @JSImport("firebase-admin/lib/database", "database.enableLogging")
    @js.native
    def enableLogging(): js.Any = js.native
    @JSImport("firebase-admin/lib/database", "database.enableLogging")
    @js.native
    def enableLogging(logger: js.UndefOr[scala.Nothing], persistent: Boolean): js.Any = js.native
    @JSImport("firebase-admin/lib/database", "database.enableLogging")
    @js.native
    def enableLogging(logger: js.Function1[/* a */ String, _]): js.Any = js.native
    @JSImport("firebase-admin/lib/database", "database.enableLogging")
    @js.native
    def enableLogging(logger: js.Function1[/* a */ String, _], persistent: Boolean): js.Any = js.native
    @JSImport("firebase-admin/lib/database", "database.enableLogging")
    @js.native
    def enableLogging(logger: Boolean): js.Any = js.native
    @JSImport("firebase-admin/lib/database", "database.enableLogging")
    @js.native
    def enableLogging(logger: Boolean, persistent: Boolean): js.Any = js.native
    
    @js.native
    trait DataSnapshot extends StObject {
      
      def child(path: String): typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot = js.native
      
      def exists(): Boolean = js.native
      
      def exportVal(): js.Any = js.native
      
      def forEach(action: js.Function1[/* a */ this.type, Boolean | Unit]): Boolean = js.native
      
      def getPriority(): String | Double | Null = js.native
      
      def hasChild(path: String): Boolean = js.native
      
      def hasChildren(): Boolean = js.native
      
      var key: String | Null = js.native
      
      def numChildren(): Double = js.native
      
      var ref: typingsSlinky.firebaseDatabaseTypes.mod.Reference = js.native
      
      def toJSON(): js.Object | Null = js.native
      
      def `val`(): js.Any = js.native
    }
    object DataSnapshot {
      
      @scala.inline
      def apply(
        child: String => typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot,
        exists: () => Boolean,
        exportVal: () => js.Any,
        forEach: js.Function1[DataSnapshot, Boolean | Unit] => Boolean,
        getPriority: () => String | Double | Null,
        hasChild: String => Boolean,
        hasChildren: () => Boolean,
        numChildren: () => Double,
        ref: typingsSlinky.firebaseDatabaseTypes.mod.Reference,
        toJSON: () => js.Object | Null,
        `val`: () => js.Any
      ): DataSnapshot = {
        val __obj = js.Dynamic.literal(child = js.Any.fromFunction1(child), exists = js.Any.fromFunction0(exists), exportVal = js.Any.fromFunction0(exportVal), forEach = js.Any.fromFunction1(forEach), getPriority = js.Any.fromFunction0(getPriority), hasChild = js.Any.fromFunction1(hasChild), hasChildren = js.Any.fromFunction0(hasChildren), numChildren = js.Any.fromFunction0(numChildren), ref = ref.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
        __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
        __obj.asInstanceOf[DataSnapshot]
      }
      
      @scala.inline
      implicit class DataSnapshotMutableBuilder[Self <: DataSnapshot] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChild(value: String => typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
        
        @scala.inline
        def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
        
        @scala.inline
        def setExportVal(value: () => js.Any): Self = StObject.set(x, "exportVal", js.Any.fromFunction0(value))
        
        @scala.inline
        def setForEach(value: js.Function1[DataSnapshot, Boolean | Unit] => Boolean): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetPriority(value: () => String | Double | Null): Self = StObject.set(x, "getPriority", js.Any.fromFunction0(value))
        
        @scala.inline
        def setHasChild(value: String => Boolean): Self = StObject.set(x, "hasChild", js.Any.fromFunction1(value))
        
        @scala.inline
        def setHasChildren(value: () => Boolean): Self = StObject.set(x, "hasChildren", js.Any.fromFunction0(value))
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyNull: Self = StObject.set(x, "key", null)
        
        @scala.inline
        def setNumChildren(value: () => Double): Self = StObject.set(x, "numChildren", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRef(value: typingsSlinky.firebaseDatabaseTypes.mod.Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToJSON(value: () => js.Object | Null): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
        
        @scala.inline
        def setVal(value: () => js.Any): Self = StObject.set(x, "val", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait Database extends FirebaseDatabase {
      
      /**
        * Gets the currently applied security rules as a string. The return value consists of
        * the rules source including comments.
        *
        * @return A promise fulfilled with the rules as a raw string.
        */
      def getRules(): js.Promise[String] = js.native
      
      /**
        * Gets the currently applied security rules as a parsed JSON object. Any comments in
        * the original source are stripped away.
        *
        * @return A promise fulfilled with the parsed rules object.
        */
      def getRulesJSON(): js.Promise[js.Object] = js.native
      
      /**
        * Sets the specified rules on the Firebase Realtime Database instance. If the rules source is
        * specified as a string or a Buffer, it may include comments.
        *
        * @param source Source of the rules to apply. Must not be `null` or empty.
        * @return Resolves when the rules are set on the Realtime Database.
        */
      def setRules(source: String): js.Promise[Unit] = js.native
      def setRules(source: js.Object): js.Promise[Unit] = js.native
      def setRules(source: Buffer): js.Promise[Unit] = js.native
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.firebaseAdmin.firebaseAdminStrings.value
      - typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_added
      - typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_changed
      - typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_moved
      - typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_removed
    */
    trait EventType extends StObject
    object EventType {
      
      @scala.inline
      def child_added: typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_added = "child_added".asInstanceOf[typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_added]
      
      @scala.inline
      def child_changed: typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_changed = "child_changed".asInstanceOf[typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_changed]
      
      @scala.inline
      def child_moved: typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_moved = "child_moved".asInstanceOf[typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_moved]
      
      @scala.inline
      def child_removed: typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_removed = "child_removed".asInstanceOf[typingsSlinky.firebaseAdmin.firebaseAdminStrings.child_removed]
      
      @scala.inline
      def value: typingsSlinky.firebaseAdmin.firebaseAdminStrings.value = "value".asInstanceOf[typingsSlinky.firebaseAdmin.firebaseAdminStrings.value]
    }
    
    @js.native
    trait OnDisconnect extends StObject {
      
      def cancel(): js.Promise[Unit] = js.native
      def cancel(onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[Unit] = js.native
      
      def remove(): js.Promise[Unit] = js.native
      def remove(onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[Unit] = js.native
      
      def set(value: js.Any): js.Promise[Unit] = js.native
      def set(value: js.Any, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[Unit] = js.native
      
      def setWithPriority(value: js.Any): js.Promise[_] = js.native
      def setWithPriority(value: js.Any, priority: String): js.Promise[_] = js.native
      def setWithPriority(value: js.Any, priority: String, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      def setWithPriority(value: js.Any, priority: Double): js.Promise[_] = js.native
      def setWithPriority(value: js.Any, priority: Double, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      def setWithPriority(value: js.Any, priority: Null, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      
      def update(values: js.Object): js.Promise[_] = js.native
      def update(values: js.Object, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
    }
    
    @js.native
    trait Query extends StObject {
      
      def endAt(): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: String, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Boolean): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Boolean, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Double): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Double, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Null, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def equalTo(): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: String, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Boolean): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Boolean, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Double): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Double, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Null, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def get(): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      
      def isEqual(): Boolean = js.native
      def isEqual(other: typingsSlinky.firebaseDatabaseTypes.mod.Query): Boolean = js.native
      
      def limitToFirst(limit: Double): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def limitToLast(limit: Double): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def off(): Unit = js.native
      def off(eventType: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Object): Unit = js.native
      def off(
        eventType: js.UndefOr[scala.Nothing],
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ]
      ): Unit = js.native
      def off(
        eventType: js.UndefOr[scala.Nothing],
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        context: js.Object
      ): Unit = js.native
      def off(eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType): Unit = js.native
      def off(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.UndefOr[scala.Nothing],
        context: js.Object
      ): Unit = js.native
      def off(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ]
      ): Unit = js.native
      def off(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        context: js.Object
      ): Unit = js.native
      
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ]
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        cancelCallbackOrContext: js.UndefOr[scala.Nothing],
        context: js.Object
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        cancelCallbackOrContext: js.Function1[/* a */ js.Error, _]
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        cancelCallbackOrContext: js.Function1[/* a */ js.Error, _],
        context: js.Object
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        cancelCallbackOrContext: js.Object
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        cancelCallbackOrContext: js.Object,
        context: js.Object
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        cancelCallbackOrContext: Null,
        context: js.Object
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      
      def once(eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.UndefOr[scala.Nothing],
        failureCallbackOrContext: js.UndefOr[scala.Nothing],
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.UndefOr[scala.Nothing],
        failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit]
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.UndefOr[scala.Nothing],
        failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit],
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.UndefOr[scala.Nothing],
        failureCallbackOrContext: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.UndefOr[scala.Nothing],
        failureCallbackOrContext: js.Object,
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.UndefOr[scala.Nothing],
        failureCallbackOrContext: Null,
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ]
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        failureCallbackOrContext: js.UndefOr[scala.Nothing],
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit]
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit],
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        failureCallbackOrContext: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        failureCallbackOrContext: js.Object,
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        failureCallbackOrContext: Null,
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      
      def orderByChild(path: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def orderByKey(): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def orderByPriority(): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def orderByValue(): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      var ref: typingsSlinky.firebaseDatabaseTypes.mod.Reference = js.native
      
      def startAt(): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: String, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Boolean): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Boolean, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Double): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Double, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Null, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def toJSON(): js.Object = js.native
    }
    
    @js.native
    trait Reference
      extends typingsSlinky.firebaseDatabaseTypes.mod.Query {
      
      def child(path: String): typingsSlinky.firebaseDatabaseTypes.mod.Reference = js.native
      
      var key: String | Null = js.native
      
      def onDisconnect(): typingsSlinky.firebaseDatabaseTypes.mod.OnDisconnect = js.native
      
      var parent: typingsSlinky.firebaseDatabaseTypes.mod.Reference | Null = js.native
      
      def push(): typingsSlinky.firebaseDatabaseTypes.mod.ThenableReference = js.native
      def push(value: js.UndefOr[scala.Nothing], onComplete: js.Function1[/* a */ js.Error | Null, _]): typingsSlinky.firebaseDatabaseTypes.mod.ThenableReference = js.native
      def push(value: js.Any): typingsSlinky.firebaseDatabaseTypes.mod.ThenableReference = js.native
      def push(value: js.Any, onComplete: js.Function1[/* a */ js.Error | Null, _]): typingsSlinky.firebaseDatabaseTypes.mod.ThenableReference = js.native
      
      def remove(): js.Promise[_] = js.native
      def remove(onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      
      var root: typingsSlinky.firebaseDatabaseTypes.mod.Reference = js.native
      
      def set(value: js.Any): js.Promise[_] = js.native
      def set(value: js.Any, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      
      def setPriority(priority: String, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      def setPriority(priority: Double, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      def setPriority(priority: Null, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      
      def setWithPriority(newVal: js.Any): js.Promise[_] = js.native
      def setWithPriority(newVal: js.Any, newPriority: String): js.Promise[_] = js.native
      def setWithPriority(newVal: js.Any, newPriority: String, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      def setWithPriority(newVal: js.Any, newPriority: Double): js.Promise[_] = js.native
      def setWithPriority(newVal: js.Any, newPriority: Double, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      def setWithPriority(newVal: js.Any, newPriority: Null, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      
      def transaction(transactionUpdate: js.Function1[/* a */ js.Any, _]): js.Promise[_] = js.native
      def transaction(
        transactionUpdate: js.Function1[/* a */ js.Any, _],
        onComplete: js.UndefOr[scala.Nothing],
        applyLocally: Boolean
      ): js.Promise[_] = js.native
      def transaction(
        transactionUpdate: js.Function1[/* a */ js.Any, _],
        onComplete: js.Function3[
              /* a */ js.Error | Null, 
              /* b */ Boolean, 
              /* c */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot | Null, 
              _
            ]
      ): js.Promise[_] = js.native
      def transaction(
        transactionUpdate: js.Function1[/* a */ js.Any, _],
        onComplete: js.Function3[
              /* a */ js.Error | Null, 
              /* b */ Boolean, 
              /* c */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot | Null, 
              _
            ],
        applyLocally: Boolean
      ): js.Promise[_] = js.native
      
      def update(values: js.Object): js.Promise[_] = js.native
      def update(values: js.Object, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
    }
    
    /* Inlined parent @firebase/database-types.@firebase/database-types.Reference */
    /* Inlined parent std.Pick<std.Promise<@firebase/database-types.@firebase/database-types.Reference>, 'then' | 'catch'> */
    @js.native
    trait ThenableReference extends StObject {
      
      def `catch`[TResult](): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.Reference | TResult] = js.native
      @JSName("catch")
      var catch_Original: js.Function0[js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.Reference | scala.Nothing]] = js.native
      
      def child(path: String): typingsSlinky.firebaseDatabaseTypes.mod.Reference = js.native
      
      def endAt(): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: String, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Boolean): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Boolean, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Double): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Double, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Null, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def equalTo(): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: String, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Boolean): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Boolean, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Double): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Double, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Null, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def get(): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      
      def isEqual(): Boolean = js.native
      def isEqual(other: typingsSlinky.firebaseDatabaseTypes.mod.Query): Boolean = js.native
      
      var key: String | Null = js.native
      
      def limitToFirst(limit: Double): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def limitToLast(limit: Double): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def off(): Unit = js.native
      def off(eventType: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Object): Unit = js.native
      def off(
        eventType: js.UndefOr[scala.Nothing],
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ]
      ): Unit = js.native
      def off(
        eventType: js.UndefOr[scala.Nothing],
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        context: js.Object
      ): Unit = js.native
      def off(eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType): Unit = js.native
      def off(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.UndefOr[scala.Nothing],
        context: js.Object
      ): Unit = js.native
      def off(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ]
      ): Unit = js.native
      def off(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        context: js.Object
      ): Unit = js.native
      
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ]
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        cancelCallbackOrContext: js.UndefOr[scala.Nothing],
        context: js.Object
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        cancelCallbackOrContext: js.Function1[/* a */ js.Error, _]
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        cancelCallbackOrContext: js.Function1[/* a */ js.Error, _],
        context: js.Object
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        cancelCallbackOrContext: js.Object
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        cancelCallbackOrContext: js.Object,
        context: js.Object
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      def on(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        cancelCallbackOrContext: Null,
        context: js.Object
      ): js.Function2[
            /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            _
          ] = js.native
      
      def onDisconnect(): typingsSlinky.firebaseDatabaseTypes.mod.OnDisconnect = js.native
      
      def once(eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.UndefOr[scala.Nothing],
        failureCallbackOrContext: js.UndefOr[scala.Nothing],
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.UndefOr[scala.Nothing],
        failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit]
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.UndefOr[scala.Nothing],
        failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit],
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.UndefOr[scala.Nothing],
        failureCallbackOrContext: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.UndefOr[scala.Nothing],
        failureCallbackOrContext: js.Object,
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.UndefOr[scala.Nothing],
        failureCallbackOrContext: Null,
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ]
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        failureCallbackOrContext: js.UndefOr[scala.Nothing],
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit]
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit],
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        failureCallbackOrContext: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        failureCallbackOrContext: js.Object,
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typingsSlinky.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              _
            ],
        failureCallbackOrContext: Null,
        context: js.Object
      ): js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      
      def orderByChild(path: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def orderByKey(): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def orderByPriority(): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def orderByValue(): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      var parent: typingsSlinky.firebaseDatabaseTypes.mod.Reference | Null = js.native
      
      def push(): typingsSlinky.firebaseDatabaseTypes.mod.ThenableReference = js.native
      def push(value: js.UndefOr[scala.Nothing], onComplete: js.Function1[/* a */ js.Error | Null, _]): typingsSlinky.firebaseDatabaseTypes.mod.ThenableReference = js.native
      def push(value: js.Any): typingsSlinky.firebaseDatabaseTypes.mod.ThenableReference = js.native
      def push(value: js.Any, onComplete: js.Function1[/* a */ js.Error | Null, _]): typingsSlinky.firebaseDatabaseTypes.mod.ThenableReference = js.native
      
      var ref: typingsSlinky.firebaseDatabaseTypes.mod.Reference = js.native
      
      def remove(): js.Promise[_] = js.native
      def remove(onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      
      var root: typingsSlinky.firebaseDatabaseTypes.mod.Reference = js.native
      
      def set(value: js.Any): js.Promise[_] = js.native
      def set(value: js.Any, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      
      def setPriority(priority: String, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      def setPriority(priority: Double, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      def setPriority(priority: Null, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      
      def setWithPriority(newVal: js.Any): js.Promise[_] = js.native
      def setWithPriority(newVal: js.Any, newPriority: String): js.Promise[_] = js.native
      def setWithPriority(newVal: js.Any, newPriority: String, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      def setWithPriority(newVal: js.Any, newPriority: Double): js.Promise[_] = js.native
      def setWithPriority(newVal: js.Any, newPriority: Double, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      def setWithPriority(newVal: js.Any, newPriority: Null, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
      
      def startAt(): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: String, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Boolean): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Boolean, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Double): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Double, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Null, key: String): typingsSlinky.firebaseDatabaseTypes.mod.Query = js.native
      
      def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
      @JSName("then")
      var then_Original: js.Function0[js.Promise[typingsSlinky.firebaseDatabaseTypes.mod.Reference | scala.Nothing]] = js.native
      
      def toJSON(): js.Object = js.native
      
      def transaction(transactionUpdate: js.Function1[/* a */ js.Any, _]): js.Promise[_] = js.native
      def transaction(
        transactionUpdate: js.Function1[/* a */ js.Any, _],
        onComplete: js.UndefOr[scala.Nothing],
        applyLocally: Boolean
      ): js.Promise[_] = js.native
      def transaction(
        transactionUpdate: js.Function1[/* a */ js.Any, _],
        onComplete: js.Function3[
              /* a */ js.Error | Null, 
              /* b */ Boolean, 
              /* c */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot | Null, 
              _
            ]
      ): js.Promise[_] = js.native
      def transaction(
        transactionUpdate: js.Function1[/* a */ js.Any, _],
        onComplete: js.Function3[
              /* a */ js.Error | Null, 
              /* b */ Boolean, 
              /* c */ typingsSlinky.firebaseDatabaseTypes.mod.DataSnapshot | Null, 
              _
            ],
        applyLocally: Boolean
      ): js.Promise[_] = js.native
      
      def update(values: js.Object): js.Promise[_] = js.native
      def update(values: js.Object, onComplete: js.Function1[/* a */ js.Error | Null, _]): js.Promise[_] = js.native
    }
  }
}
