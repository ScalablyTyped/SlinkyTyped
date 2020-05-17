package typingsSlinky.pdfmake.interfacesMod

import typingsSlinky.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// not exported, only used to prevent Content from circularly referencing itself
@js.native
trait ArrayOfContent
  extends Array[Content]
     with Content

