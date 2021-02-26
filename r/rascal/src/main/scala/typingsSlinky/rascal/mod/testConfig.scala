package typingsSlinky.rascal.mod

import typingsSlinky.rascal.anon.Counters
import typingsSlinky.rascal.anon.Redeliveries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testConfig {
  
  @JSImport("rascal", "testConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rascal", "testConfig.defaults")
  @js.native
  def defaults: Redeliveries = js.native
  @scala.inline
  def defaults_=(x: Redeliveries): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("rascal", "testConfig.redeliveries")
  @js.native
  def redeliveries: Counters = js.native
  @scala.inline
  def redeliveries_=(x: Counters): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redeliveries")(x.asInstanceOf[js.Any])
}
