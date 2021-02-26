package typingsSlinky.reduxOrm

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.reduxOrm.modelMod.AnyModel
import typingsSlinky.reduxOrm.modelMod.IdType
import typingsSlinky.reduxOrm.modelMod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GetId[M /* <: Model[Instantiable0[AnyModel], _] */] extends StObject {
    
    def getId(): IdType[M] = js.native
  }
  object GetId {
    
    @scala.inline
    def apply[M /* <: Model[Instantiable0[AnyModel], _] */](getId: () => IdType[M]): GetId[M] = {
      val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId))
      __obj.asInstanceOf[GetId[M]]
    }
    
    @scala.inline
    implicit class GetIdMutableBuilder[Self <: GetId[_], M /* <: Model[Instantiable0[AnyModel], _] */] (val x: Self with GetId[M]) extends AnyVal {
      
      @scala.inline
      def setGetId(value: () => IdType[M]): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TypeofQuerySet extends StObject {
    
    /**
      * Register custom method on a `QuerySet` class specification.
      * QuerySet class may be attached to a {@link Model} class via {@link Model#querySetClass}
      *
      * @param methodName - name of a method to be available on specific QuerySet class instances
      *
      * @example:
      * class CustomQuerySet extends QuerySet<Book> {
      *     static currentYear = 2019
      *     unreleased(): QuerySet<Book> {
      *         return this.filter(book => book.releaseYear > CustomQuerySet.currentYear);
      *     }
      * }
      * CustomQuerySet.addSharedMethod('unreleased');
      * // assign specific QuerySet to a Model class
      * Book.querySetClass = typeof CustomQuerySet;
      * // register models
      * const schema = {Book };
      * const orm = new ORM<typeof schema>();
      * orm.register(Book);
      * const session = orm.session(orm.getEmptyState());
      * // use shared method
      * const unreleased = customQs.unreleased();
      */
    def addSharedMethod(methodName: String): Unit = js.native
  }
  object TypeofQuerySet {
    
    @scala.inline
    def apply(addSharedMethod: String => Unit): TypeofQuerySet = {
      val __obj = js.Dynamic.literal(addSharedMethod = js.Any.fromFunction1(addSharedMethod))
      __obj.asInstanceOf[TypeofQuerySet]
    }
    
    @scala.inline
    implicit class TypeofQuerySetMutableBuilder[Self <: TypeofQuerySet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddSharedMethod(value: String => Unit): Self = StObject.set(x, "addSharedMethod", js.Any.fromFunction1(value))
    }
  }
}
