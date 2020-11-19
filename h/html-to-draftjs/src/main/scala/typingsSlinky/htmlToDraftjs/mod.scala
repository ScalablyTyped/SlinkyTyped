package typingsSlinky.htmlToDraftjs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.draftJs.mod.Draft.Model.Encoding.RawDraftEntity
import typingsSlinky.htmlToDraftjs.anon.ContentBlocks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html-to-draftjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(text: String): ContentBlocks = js.native
  def default(
    text: String,
    customChunkRenderer: js.Function2[
      /* nodeName */ String, 
      /* node */ HTMLElement, 
      js.UndefOr[RawDraftEntity[StringDictionary[_]]]
    ]
  ): ContentBlocks = js.native
}
