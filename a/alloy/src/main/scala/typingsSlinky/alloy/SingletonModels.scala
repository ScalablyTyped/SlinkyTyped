package typingsSlinky.alloy

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.backbone.mod.Model
import typingsSlinky.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingletonModels
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * Creates a singleton instance of a Model based on the given model, or
    * returns an existing instance if one has already been created.
    *
    * @param name The name of the base model for the model.
    */
  def instance(name: String): Model[_, ModelSetOptions, js.Object] = js.native
}
object SingletonModels {
  
  @scala.inline
  def apply(instance: String => Model[_, ModelSetOptions, js.Object]): SingletonModels = {
    val __obj = js.Dynamic.literal(instance = js.Any.fromFunction1(instance))
    __obj.asInstanceOf[SingletonModels]
  }
  
  @scala.inline
  implicit class SingletonModelsMutableBuilder[Self <: SingletonModels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: String => Model[_, ModelSetOptions, js.Object]): Self = StObject.set(x, "instance", js.Any.fromFunction1(value))
  }
}
