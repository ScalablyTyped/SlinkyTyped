package typingsSlinky.markdownToJsx.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.markdownToJsx.anon.Dictkey
import typingsSlinky.react.mod.Attributes
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkdownOptions extends js.Object {
  
  /** Custom React.createElement behavior. */
  var createElement: js.UndefOr[
    js.Function3[
      /* type */ ReactComponentClass[js.Object] | String, 
      /* props */ js.UndefOr[(Attributes with js.Object) | Null], 
      /* repeated */ ReactElement, 
      ReactElement
    ]
  ] = js.native
  
  /** By default, raw HTML is parsed to JSX. This behavior can be disabled with this option. */
  var disableParsingRawHTML: js.UndefOr[Boolean] = js.native
  
  /** Force all input strings to use block layout. */
  var forceBlock: js.UndefOr[Boolean] = js.native
  
  /** Force all input strings to use inline layout. */
  var forceInline: js.UndefOr[Boolean] = js.native
  
  /** Override named html codes that should be converted to unicode characters. */
  var namedCodesToUnicode: js.UndefOr[Record[String, String]] = js.native
  
  /** Override representation of any HTML tag or custom component. */
  var overrides: js.UndefOr[Dictkey] = js.native
  
  /** Custom function to generate an HTML id from headings. */
  var slugify: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
}
object MarkdownOptions {
  
  @scala.inline
  def apply(): MarkdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkdownOptions]
  }
  
  @scala.inline
  implicit class MarkdownOptionsOps[Self <: MarkdownOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateElement(
      value: (/* type */ ReactComponentClass[js.Object] | String, /* props */ js.UndefOr[(Attributes with js.Object) | Null], /* repeated */ ReactElement) => ReactElement
    ): Self = this.set("createElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCreateElement: Self = this.set("createElement", js.undefined)
    
    @scala.inline
    def setDisableParsingRawHTML(value: Boolean): Self = this.set("disableParsingRawHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableParsingRawHTML: Self = this.set("disableParsingRawHTML", js.undefined)
    
    @scala.inline
    def setForceBlock(value: Boolean): Self = this.set("forceBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceBlock: Self = this.set("forceBlock", js.undefined)
    
    @scala.inline
    def setForceInline(value: Boolean): Self = this.set("forceInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceInline: Self = this.set("forceInline", js.undefined)
    
    @scala.inline
    def setNamedCodesToUnicode(value: Record[String, String]): Self = this.set("namedCodesToUnicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedCodesToUnicode: Self = this.set("namedCodesToUnicode", js.undefined)
    
    @scala.inline
    def setOverrides(value: Dictkey): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setSlugify(value: /* text */ String => String): Self = this.set("slugify", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSlugify: Self = this.set("slugify", js.undefined)
  }
}
