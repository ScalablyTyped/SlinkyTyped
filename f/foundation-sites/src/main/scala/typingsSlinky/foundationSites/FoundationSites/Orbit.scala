package typingsSlinky.foundationSites.FoundationSites

import typingsSlinky.foundationSites.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/orbit.html#javascript-reference
@js.native
trait Orbit extends StObject {
  
  def changeSlide(isLTR: Boolean): Unit = js.native
  def changeSlide(isLTR: Boolean, chosenSlide: js.UndefOr[scala.Nothing], idx: Double): Unit = js.native
  def changeSlide(isLTR: Boolean, chosenSlide: JQuery): Unit = js.native
  def changeSlide(isLTR: Boolean, chosenSlide: JQuery, idx: Double): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def geoSync(): Unit = js.native
}
