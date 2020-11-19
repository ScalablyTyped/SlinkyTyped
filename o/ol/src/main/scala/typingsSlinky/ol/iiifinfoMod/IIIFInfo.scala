package typingsSlinky.ol.iiifinfoMod

import typingsSlinky.ol.iiifMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIIFInfo extends js.Object {
  
  def getComplianceLevelEntryFromProfile(version: Versions): String = js.native
  
  def getComplianceLevelFromProfile(version: Versions): String = js.native
  
  def getComplianceLevelSupportedFeatures(): SupportedFeatures = js.native
  
  def getImageApiVersion(): Versions = js.native
  
  def getTileSourceOptions(): Options = js.native
  def getTileSourceOptions(opt_preferredOptions: PreferredOptions): Options = js.native
  
  def setImageInfo(imageInfo: String): Unit = js.native
  def setImageInfo(imageInfo: ImageInformationResponse): Unit = js.native
}
