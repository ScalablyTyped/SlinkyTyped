package typingsSlinky.htmlToDraftjs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.draftJs.mod.Draft.Model.Encoding.RawDraftEntity
import typingsSlinky.htmlToDraftjs.anon.ContentBlocks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-to-draftjs", JSImport.Default)
  @js.native
  def default(text: String): ContentBlocks = js.native
  @JSImport("html-to-draftjs", JSImport.Default)
  @js.native
  def default(
    text: String,
    customChunkRenderer: js.Function2[
      /* nodeName */ String, 
      /* node */ HTMLElement, 
      js.UndefOr[RawDraftEntity[StringDictionary[_]]]
    ]
  ): ContentBlocks = js.native
}
