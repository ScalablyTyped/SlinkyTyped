package typingsSlinky.cadesplugin.CAPICOM

import typingsSlinky.cadesplugin.CADESCommon.ValuesOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificates extends StObject {
  
  val Count: Double = js.native
  
  def Find(findType: ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE]): Certificates = js.native
  def Find(
    findType: ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE],
    varCriteria: js.UndefOr[scala.Nothing],
    bFindValidOnly: Boolean
  ): Certificates = js.native
  def Find(findType: ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], varCriteria: js.Any): Certificates = js.native
  def Find(findType: ValuesOf[CAPICOM_CERTIFICATE_FIND_TYPE], varCriteria: js.Any, bFindValidOnly: Boolean): Certificates = js.native
  
  def Item(index: Double): Certificate = js.native
  
  def Select(): Certificates = js.native
  def Select(title: js.UndefOr[scala.Nothing], displayString: js.UndefOr[scala.Nothing], bMultiSelect: Boolean): Certificates = js.native
  def Select(title: js.UndefOr[scala.Nothing], displayString: String): Certificates = js.native
  def Select(title: js.UndefOr[scala.Nothing], displayString: String, bMultiSelect: Boolean): Certificates = js.native
  def Select(title: String): Certificates = js.native
  def Select(title: String, displayString: js.UndefOr[scala.Nothing], bMultiSelect: Boolean): Certificates = js.native
  def Select(title: String, displayString: String): Certificates = js.native
  def Select(title: String, displayString: String, bMultiSelect: Boolean): Certificates = js.native
}
