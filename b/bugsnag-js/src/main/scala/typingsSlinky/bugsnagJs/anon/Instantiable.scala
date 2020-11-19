package typingsSlinky.bugsnagJs.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.bugsnagJs.reportMod.IHandledState
import typingsSlinky.bugsnagJs.reportMod.IStackframe
import typingsSlinky.bugsnagJs.reportMod.Report
import typingsSlinky.bugsnagJs.reportMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable
  extends Instantiable2[/* errorClass */ String, /* errorMessage */ String, default]
     with Instantiable3[
      /* errorClass */ String, 
      /* errorMessage */ String, 
      /* stacktrace */ js.Array[js.Any], 
      default
    ]
     with Instantiable4[
      /* errorClass */ String, 
      /* errorMessage */ String, 
      js.UndefOr[/* stacktrace */ js.Array[js.Any]], 
      /* handledState */ IHandledState, 
      default
    ] {
  
  def ensureReport(reportOrError: js.Any): Report = js.native
  def ensureReport(reportOrError: js.Any, errorFramesToSkip: js.UndefOr[scala.Nothing], generatedFramesToSkip: Double): Report = js.native
  def ensureReport(reportOrError: js.Any, errorFramesToSkip: Double): Report = js.native
  def ensureReport(reportOrError: js.Any, errorFramesToSkip: Double, generatedFramesToSkip: Double): Report = js.native
  
  def getStacktrace(error: js.Any): js.Array[IStackframe] = js.native
  def getStacktrace(error: js.Any, errorFramesToSkip: js.UndefOr[scala.Nothing], generatedFramesToSkip: Double): js.Array[IStackframe] = js.native
  def getStacktrace(error: js.Any, errorFramesToSkip: Double): js.Array[IStackframe] = js.native
  def getStacktrace(error: js.Any, errorFramesToSkip: Double, generatedFramesToSkip: Double): js.Array[IStackframe] = js.native
}
