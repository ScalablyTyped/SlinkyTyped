package typingsSlinky.knockoutTransformations.KnockoutTransformations

import typingsSlinky.knockoutTransformations.anon.Dispose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappingWithDisposeCallbackOption[T, TResult] extends js.Object {
  
  def mappingWithDisposeCallback(value: T): Dispose[TResult] = js.native
}
object MappingWithDisposeCallbackOption {
  
  @scala.inline
  def apply[T, TResult](mappingWithDisposeCallback: T => Dispose[TResult]): MappingWithDisposeCallbackOption[T, TResult] = {
    val __obj = js.Dynamic.literal(mappingWithDisposeCallback = js.Any.fromFunction1(mappingWithDisposeCallback))
    __obj.asInstanceOf[MappingWithDisposeCallbackOption[T, TResult]]
  }
  
  @scala.inline
  implicit class MappingWithDisposeCallbackOptionOps[Self <: MappingWithDisposeCallbackOption[_, _], T, TResult] (val x: Self with (MappingWithDisposeCallbackOption[T, TResult])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMappingWithDisposeCallback(value: T => Dispose[TResult]): Self = this.set("mappingWithDisposeCallback", js.Any.fromFunction1(value))
  }
}
