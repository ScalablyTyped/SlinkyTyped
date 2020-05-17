package typingsSlinky.mocha.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.mocha.BrowserMocha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Reporter augmentations
// #region Browser augmentations
/**
  * Mocha global.
  *
  * - _Only supported in the browser._
  */
@JSGlobal("mocha")
@js.native
object mocha extends TopLevel[BrowserMocha]

