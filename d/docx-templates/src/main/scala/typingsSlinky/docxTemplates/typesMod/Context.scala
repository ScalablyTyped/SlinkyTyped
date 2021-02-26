package typingsSlinky.docxTemplates.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.docxTemplates.anon.Wp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends StObject {
  
  var buffers: Wp = js.native
  
  var cmd: String = js.native
  
  var fCmd: Boolean = js.native
  
  var fJump: Boolean = js.native
  
  var fSeekQuery: Boolean = js.native
  
  var gCntIf: Double = js.native
  
  var htmlId: Double = js.native
  
  var htmls: Htmls = js.native
  
  var imageId: Double = js.native
  
  var images: Images = js.native
  
  var jsSandbox: js.UndefOr[js.Object] = js.native
  
  var level: Double = js.native
  
  var linkId: Double = js.native
  
  var links: Links = js.native
  
  var loops: js.Array[LoopStatus] = js.native
  
  var options: CreateReportOptions = js.native
  
  var pendingHtmlNode: js.UndefOr[TextNode | NonTextNode] = js.native
  
  var pendingImageNode: js.UndefOr[NonTextNode] = js.native
  
  var pendingLinkNode: js.UndefOr[NonTextNode] = js.native
  
  var query: js.UndefOr[Query] = js.native
  
  var shorthands: StringDictionary[String] = js.native
  
  var textRunPropsNode: js.UndefOr[NonTextNode] = js.native
  
  var vars: StringDictionary[VarValue] = js.native
}
object Context {
  
  @scala.inline
  def apply(
    buffers: Wp,
    cmd: String,
    fCmd: Boolean,
    fJump: Boolean,
    fSeekQuery: Boolean,
    gCntIf: Double,
    htmlId: Double,
    htmls: Htmls,
    imageId: Double,
    images: Images,
    level: Double,
    linkId: Double,
    links: Links,
    loops: js.Array[LoopStatus],
    options: CreateReportOptions,
    shorthands: StringDictionary[String],
    vars: StringDictionary[VarValue]
  ): Context = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], fCmd = fCmd.asInstanceOf[js.Any], fJump = fJump.asInstanceOf[js.Any], fSeekQuery = fSeekQuery.asInstanceOf[js.Any], gCntIf = gCntIf.asInstanceOf[js.Any], htmlId = htmlId.asInstanceOf[js.Any], htmls = htmls.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], linkId = linkId.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], loops = loops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffers(value: Wp): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFCmd(value: Boolean): Self = StObject.set(x, "fCmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFJump(value: Boolean): Self = StObject.set(x, "fJump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFSeekQuery(value: Boolean): Self = StObject.set(x, "fSeekQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGCntIf(value: Double): Self = StObject.set(x, "gCntIf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlId(value: Double): Self = StObject.set(x, "htmlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmls(value: Htmls): Self = StObject.set(x, "htmls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageId(value: Double): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: Images): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsSandbox(value: js.Object): Self = StObject.set(x, "jsSandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsSandboxUndefined: Self = StObject.set(x, "jsSandbox", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkId(value: Double): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoops(value: js.Array[LoopStatus]): Self = StObject.set(x, "loops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopsVarargs(value: LoopStatus*): Self = StObject.set(x, "loops", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: CreateReportOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingHtmlNode(value: TextNode | NonTextNode): Self = StObject.set(x, "pendingHtmlNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingHtmlNodeUndefined: Self = StObject.set(x, "pendingHtmlNode", js.undefined)
    
    @scala.inline
    def setPendingImageNode(value: NonTextNode): Self = StObject.set(x, "pendingImageNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingImageNodeUndefined: Self = StObject.set(x, "pendingImageNode", js.undefined)
    
    @scala.inline
    def setPendingLinkNode(value: NonTextNode): Self = StObject.set(x, "pendingLinkNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingLinkNodeUndefined: Self = StObject.set(x, "pendingLinkNode", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setShorthands(value: StringDictionary[String]): Self = StObject.set(x, "shorthands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRunPropsNode(value: NonTextNode): Self = StObject.set(x, "textRunPropsNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRunPropsNodeUndefined: Self = StObject.set(x, "textRunPropsNode", js.undefined)
    
    @scala.inline
    def setVars(value: StringDictionary[VarValue]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
  }
}
