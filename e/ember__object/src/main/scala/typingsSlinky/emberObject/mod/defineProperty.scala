package typingsSlinky.emberObject.mod

import typingsSlinky.emberObject.computedMod.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object", "defineProperty")
@js.native
object defineProperty extends js.Object {
  def apply(obj: js.Object, keyName: String): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: ComputedProperty[_, _]): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: ComputedProperty[_, _], data: js.Any): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: ComputedProperty[_, _], data: js.Any, meta: js.Any): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: js.PropertyDescriptor): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: js.PropertyDescriptor, data: js.Any): Unit = js.native
  def apply(obj: js.Object, keyName: String, desc: js.PropertyDescriptor, data: js.Any, meta: js.Any): Unit = js.native
}

