package typingsSlinky.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait platform extends StObject
@JSImport("itunesconnectanalytics", "platform")
@js.native
object platform extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[platform with String] = js.native
  
  @js.native
  sealed trait appleTV extends platform
  /* "AppleTV" */ val appleTV: typingsSlinky.itunesconnectanalytics.mod.platform.appleTV with String = js.native
  
  @js.native
  sealed trait iPad extends platform
  /* "iPad" */ val iPad: typingsSlinky.itunesconnectanalytics.mod.platform.iPad with String = js.native
  
  @js.native
  sealed trait iPhone extends platform
  /* "iPhone" */ val iPhone: typingsSlinky.itunesconnectanalytics.mod.platform.iPhone with String = js.native
  
  @js.native
  sealed trait iPod extends platform
  /* "iPod" */ val iPod: typingsSlinky.itunesconnectanalytics.mod.platform.iPod with String = js.native
}
