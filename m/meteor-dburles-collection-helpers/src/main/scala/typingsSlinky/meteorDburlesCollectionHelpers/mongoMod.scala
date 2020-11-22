package typingsSlinky.meteorDburlesCollectionHelpers

import typingsSlinky.meteor.Meteor.LiveQueryHandle
import typingsSlinky.meteor.mongoMod.Mongo.Modifier
import typingsSlinky.meteor.mongoMod.Mongo.ObjectID
import typingsSlinky.meteor.mongoMod.Mongo.ObserveCallbacks
import typingsSlinky.meteor.mongoMod.Mongo.OptionalId
import typingsSlinky.meteor.mongoMod.Mongo.Selector
import typingsSlinky.meteorDburlesCollectionHelpers.anon.ArrayFilters
import typingsSlinky.meteorDburlesCollectionHelpers.anon.Fetch
import typingsSlinky.meteorDburlesCollectionHelpers.anon.Fields
import typingsSlinky.meteorDburlesCollectionHelpers.anon.InsertedId
import typingsSlinky.meteorDburlesCollectionHelpers.anon.Multi
import typingsSlinky.meteorDburlesCollectionHelpers.meteorDburlesCollectionHelpersBooleans.`false`
import typingsSlinky.meteorDburlesCollectionHelpers.mod.AllowPartial
import typingsSlinky.meteorDburlesCollectionHelpers.mod.Data
import typingsSlinky.meteorDburlesCollectionHelpers.mod.Full
import typingsSlinky.meteorDburlesCollectionHelpers.mod.Helpers
import typingsSlinky.meteorDburlesCollectionHelpers.mod.PartialHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("meteor/mongo", JSImport.Namespace)
@js.native
object mongoMod extends js.Object {
  
  @js.native
  object Mongo extends js.Object {
    
    @js.native
    trait Collection[T] extends js.Object {
      
      // modifications:
      // - replaced T with Full<T> & T everywhere Collection._transform is applied
      // - replaced T with Data<T> everywhere the user provides a T
      def allow(options: Fetch[T]): Boolean = js.native
      
      def deny(options: Fetch[T]): Boolean = js.native
      
      def findOne(): js.UndefOr[Full[T] with T] = js.native
      def findOne(selector: js.UndefOr[Selector[T]], options: Fields): js.UndefOr[Full[T] with T] = js.native
      def findOne(selector: String): js.UndefOr[Full[T] with T] = js.native
      def findOne(selector: String, options: Fields): js.UndefOr[Full[T] with T] = js.native
      def findOne(selector: ObjectID): js.UndefOr[Full[T] with T] = js.native
      def findOne(selector: ObjectID, options: Fields): js.UndefOr[Full[T] with T] = js.native
      def findOne(selector: Selector[T]): js.UndefOr[Full[T] with T] = js.native
      
      /**
        * Provide the definitions here for the methods and Helper<T>s you declared on your item interface.
        * Use helpers<AllowPartial> if you want to provide the helpers across multiple calls.
        * Tip: If you make those properties non-optional, they still won't be required when inserting items,
        * but you'll know that any object of your interface type has them.
        * Alternatively, if they're marked optional on your interface, they'll still be guaranteed on any
        * object you get out of the collection.
        * If you plan to pass around and create a lot of items pre-insertion, make them optional and use Full<T>
        * for ones with helpers attached.
        * If you plan to mostly pass around items that came out of a collection, make them required and use Data<T>
        * when creating new items.
        */
      def helpers[allowPartial /* <: `false` | AllowPartial */](// tslint:disable-next-line no-unnecessary-generics
      helpers: Helpers[T] | PartialHelpers[T]): Unit = js.native
      
      // ditto
      // tslint:disable-next-line ban-types
      def insert(doc: OptionalId[Data[T]]): String = js.native
      def insert(doc: OptionalId[Data[T]], callback: js.Function): String = js.native
      
      def update(selector: String, modifier: Modifier[Data[T]]): Double = js.native
      def update(
        selector: String,
        modifier: Modifier[Data[T]],
        options: js.UndefOr[scala.Nothing],
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): Double = js.native
      def update(selector: String, modifier: Modifier[Data[T]], options: ArrayFilters): Double = js.native
      def update(
        selector: String,
        modifier: Modifier[Data[T]],
        options: ArrayFilters,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): Double = js.native
      def update(selector: ObjectID, modifier: Modifier[Data[T]]): Double = js.native
      def update(
        selector: ObjectID,
        modifier: Modifier[Data[T]],
        options: js.UndefOr[scala.Nothing],
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): Double = js.native
      def update(selector: ObjectID, modifier: Modifier[Data[T]], options: ArrayFilters): Double = js.native
      def update(
        selector: ObjectID,
        modifier: Modifier[Data[T]],
        options: ArrayFilters,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): Double = js.native
      def update(selector: Selector[T], modifier: Modifier[Data[T]]): Double = js.native
      def update(
        selector: Selector[T],
        modifier: Modifier[Data[T]],
        options: js.UndefOr[scala.Nothing],
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): Double = js.native
      def update(selector: Selector[T], modifier: Modifier[Data[T]], options: ArrayFilters): Double = js.native
      def update(
        selector: Selector[T],
        modifier: Modifier[Data[T]],
        options: ArrayFilters,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): Double = js.native
      
      def upsert(selector: String, modifier: Modifier[Data[T]]): InsertedId = js.native
      def upsert(
        selector: String,
        modifier: Modifier[Data[T]],
        options: js.UndefOr[scala.Nothing],
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): InsertedId = js.native
      def upsert(selector: String, modifier: Modifier[Data[T]], options: Multi): InsertedId = js.native
      def upsert(
        selector: String,
        modifier: Modifier[Data[T]],
        options: Multi,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): InsertedId = js.native
      def upsert(selector: ObjectID, modifier: Modifier[Data[T]]): InsertedId = js.native
      def upsert(
        selector: ObjectID,
        modifier: Modifier[Data[T]],
        options: js.UndefOr[scala.Nothing],
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): InsertedId = js.native
      def upsert(selector: ObjectID, modifier: Modifier[Data[T]], options: Multi): InsertedId = js.native
      def upsert(
        selector: ObjectID,
        modifier: Modifier[Data[T]],
        options: Multi,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): InsertedId = js.native
      def upsert(selector: Selector[T], modifier: Modifier[Data[T]]): InsertedId = js.native
      def upsert(
        selector: Selector[T],
        modifier: Modifier[Data[T]],
        options: js.UndefOr[scala.Nothing],
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): InsertedId = js.native
      def upsert(selector: Selector[T], modifier: Modifier[Data[T]], options: Multi): InsertedId = js.native
      def upsert(
        selector: Selector[T],
        modifier: Modifier[Data[T]],
        options: Multi,
        // ditto
      // tslint:disable-next-line ban-types
      callback: js.Function
      ): InsertedId = js.native
    }
    
    // modifications: replaced T with Full<T> & T everywhere Collection._transform is applied
    // note: it's not applied for observeChanges; however, ObserveChangesCallbacks uses Partial<T> anyway
    @js.native
    trait Cursor[T] extends js.Object {
      
      def fetch(): js.Array[Full[T] with T] = js.native
      
      def forEach(callback: js.Function3[/* doc */ Full[T] with T, /* index */ Double, /* cursor */ Cursor[T], Unit]): Unit = js.native
      def forEach(
        callback: js.Function3[/* doc */ Full[T] with T, /* index */ Double, /* cursor */ Cursor[T], Unit],
        thisArg: js.Any
      ): Unit = js.native
      
      def map[U](callback: js.Function3[/* doc */ Full[T] with T, /* index */ Double, /* cursor */ Cursor[T], U]): js.Array[U] = js.native
      def map[U](
        callback: js.Function3[/* doc */ Full[T] with T, /* index */ Double, /* cursor */ Cursor[T], U],
        thisArg: js.Any
      ): js.Array[U] = js.native
      
      def observe(callbacks: ObserveCallbacks[Full[T] with T]): LiveQueryHandle = js.native
    }
  }
}
