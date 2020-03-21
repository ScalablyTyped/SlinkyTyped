package typingsSlinky.openlayers.mod.control.ScaleLine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Units for the scale line. Supported values are `'degrees'`, `'imperial'`,
  * `'nautical'`, `'metric'`, `'us'`.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.openlayers.openlayersStrings.degrees
  - typingsSlinky.openlayers.openlayersStrings.imperial
  - typingsSlinky.openlayers.openlayersStrings.nautical
  - typingsSlinky.openlayers.openlayersStrings.metric
  - typingsSlinky.openlayers.openlayersStrings.us
*/
trait Units extends js.Object

object Units {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def degrees: typingsSlinky.openlayers.openlayersStrings.degrees = this.cast("degrees")
  @scala.inline
  def imperial: typingsSlinky.openlayers.openlayersStrings.imperial = this.cast("imperial")
  @scala.inline
  def metric: typingsSlinky.openlayers.openlayersStrings.metric = this.cast("metric")
  @scala.inline
  def nautical: typingsSlinky.openlayers.openlayersStrings.nautical = this.cast("nautical")
  @scala.inline
  def us: typingsSlinky.openlayers.openlayersStrings.us = this.cast("us")
}

