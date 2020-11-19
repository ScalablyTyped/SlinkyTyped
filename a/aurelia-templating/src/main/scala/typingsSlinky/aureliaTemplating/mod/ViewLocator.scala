package typingsSlinky.aureliaTemplating.mod

import typingsSlinky.aureliaMetadata.mod.Origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ViewLocator")
@js.native
class ViewLocator () extends js.Object {
  
  /**
    * Conventionally converts a view model origin to a view url.
    * Used by the ConventionalViewStrategy.
    * @param origin The origin of the view model to convert.
    * @return The view url.
    */
  def convertOriginToViewUrl(origin: Origin): String = js.native
  
  /**
    * Creates a fallback View Strategy. Used when unable to locate a configured strategy.
    * The default implementation returns and instance of ConventionalViewStrategy.
    * @param origin The origin of the view model to return the strategy for.
    * @return The fallback ViewStrategy.
    */
  def createFallbackViewStrategy(origin: Origin): ViewStrategy_ = js.native
  
  /**
    * Gets the view strategy for the value.
    * @param value The value to locate the view strategy for.
    * @return The located ViewStrategy instance.
    */
  def getViewStrategy(value: js.Any): ViewStrategy_ = js.native
}
/* static members */
@JSImport("aurelia-templating", "ViewLocator")
@js.native
object ViewLocator extends js.Object {
  
  /**
    * The metadata key for storing/finding view strategies associated with an class/object.
    */
  var viewStrategyMetadataKey: js.Any = js.native
}
