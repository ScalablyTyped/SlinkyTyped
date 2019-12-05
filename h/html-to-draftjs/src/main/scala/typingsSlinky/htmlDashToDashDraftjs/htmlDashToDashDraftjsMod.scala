package typingsSlinky.htmlDashToDashDraftjs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.Encoding.RawDraftEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html-to-draftjs", JSImport.Namespace)
@js.native
object htmlDashToDashDraftjsMod extends js.Object {
  def default(text: String): Anon_ContentBlocks = js.native
  def default(
    text: String,
    customChunkRenderer: js.Function2[
      /* nodeName */ String, 
      /* node */ HTMLElement, 
      js.UndefOr[RawDraftEntity[StringDictionary[_]]]
    ]
  ): Anon_ContentBlocks = js.native
}

