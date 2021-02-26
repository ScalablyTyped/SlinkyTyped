package typingsSlinky.googleapis.genomicsV1Mod.genomicsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when the worker starts pulling an image.
  */
@js.native
trait SchemaPullStartedEvent extends StObject {
  
  /**
    * The URI of the image that was pulled.
    */
  var imageUri: js.UndefOr[String] = js.native
}
object SchemaPullStartedEvent {
  
  @scala.inline
  def apply(): SchemaPullStartedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullStartedEvent]
  }
  
  @scala.inline
  implicit class SchemaPullStartedEventMutableBuilder[Self <: SchemaPullStartedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
