package typingsSlinky.durandal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables automatic observability of plain javascript object for ES5 compatible browsers. Also, converts promise properties into observables that are updated when the promise resolves.
  * @requires system
  * @requires binder
  * @requires knockout
  */
@JSImport("plugins/observable", JSImport.Namespace)
@js.native
object observableMod extends js.Object {
  
  def apply(obj: js.Any, property: String): js.Any = js.native
  
  def convertObject(obj: js.Any): Unit = js.native
  
  def convertProperty(obj: js.Any, propertyName: String): js.Any = js.native
  def convertProperty(obj: js.Any, propertyName: String, original: js.Any): js.Any = js.native
  
  def defineProperty[T](obj: js.Any, propertyName: String): js.Any = js.native
  def defineProperty[T](
    obj: js.Any,
    propertyName: String,
    evaluatorOrOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputedDefine<T> */ js.Any
  ): js.Any = js.native
  
  def install(config: js.Object): Unit = js.native
}
