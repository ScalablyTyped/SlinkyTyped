package typingsSlinky.overwatchApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def getProfile(
    platform: typingsSlinky.overwatchApi.mod.PLATFORM,
    region: typingsSlinky.overwatchApi.mod.REGION,
    tag: java.lang.String,
    callback: js.Function2[/* err */ js.Error, /* data */ typingsSlinky.overwatchApi.mod.Profile, scala.Unit]
  ): scala.Unit = (typingsSlinky.overwatchApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getProfile")(platform.asInstanceOf[js.Any], region.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getStats(
    platform: typingsSlinky.overwatchApi.mod.PLATFORM,
    region: typingsSlinky.overwatchApi.mod.REGION,
    tag: java.lang.String,
    callback: js.Function2[/* err */ js.Error, /* data */ typingsSlinky.overwatchApi.mod.Stats, scala.Unit]
  ): scala.Unit = (typingsSlinky.overwatchApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getStats")(platform.asInstanceOf[js.Any], region.asInstanceOf[js.Any], tag.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
