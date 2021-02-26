package typingsSlinky.hafasClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(commonProfile: typingsSlinky.hafasClient.mod.Profile, userAgent: java.lang.String): typingsSlinky.hafasClient.mod.HafasClient = (typingsSlinky.hafasClient.mod.^.asInstanceOf[js.Dynamic].apply(commonProfile.asInstanceOf[js.Any], userAgent.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.hafasClient.mod.HafasClient]
  @scala.inline
  def apply(commonProfile: typingsSlinky.hafasClient.mod.Profile, userAgent: java.lang.String, opt: js.Any): typingsSlinky.hafasClient.mod.HafasClient = (typingsSlinky.hafasClient.mod.^.asInstanceOf[js.Dynamic].apply(commonProfile.asInstanceOf[js.Any], userAgent.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.hafasClient.mod.HafasClient]
  
  type Facilities = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Boolean]
  
  /**
    * Ids of a Stop, i.e. dhid as 'DELFI Haltestellen ID'
    */
  type Ids = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  /** Each public transportation network exposes its products as boolean properties. See {@link ProductType} */
  type Products = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  type ScheduledDays = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
