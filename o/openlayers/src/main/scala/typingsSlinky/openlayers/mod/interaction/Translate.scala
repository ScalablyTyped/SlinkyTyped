package typingsSlinky.openlayers.mod.interaction

import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.Coordinate_
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.olx.interaction.TranslateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Interaction for translating (moving) features.
  *
  * @fires ol.interaction.TranslateEvent
  * @param options Options.
  * @api
  */
@JSImport("openlayers", "interaction.Translate")
@js.native
class Translate protected () extends Pointer {
  /**
    * @classdesc
    * Interaction for translating (moving) features.
    *
    * @fires ol.interaction.TranslateEvent
    * @param options Options.
    * @api
    */
  def this(options: TranslateOptions) = this()
}
@JSImport("openlayers", "interaction.Translate")
@js.native
object Translate extends js.Object {
  
  /**
    * @classdesc
    * Events emitted by {@link ol.interaction.Translate} instances are instances of
    * this type.
    *
    * @param type Type.
    * @param features The features translated.
    * @param coordinate The event coordinate.
    */
  @js.native
  class Event protected ()
    extends typingsSlinky.openlayers.mod.events.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Translate} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param features The features translated.
      * @param coordinate The event coordinate.
      */
    def this(`type`: TranslateEventType, features: Collection[Feature], coordinate: Coordinate_) = this()
    
    /**
      * The coordinate of the drag event.
      * @const
      * @api
      */
    var coordinate: Coordinate_ = js.native
    
    /**
      * The features being translated.
      * @api
      */
    var features: Collection[Feature] = js.native
  }
}
