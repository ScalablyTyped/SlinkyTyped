package typingsSlinky.gatsbyTransformerRemark

import typingsSlinky.gatsbyTransformerRemark.anon.Absolute
import typingsSlinky.gatsbyTransformerRemark.gatsbyTransformerRemarkStrings.`gatsby-transformer-remark`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait RemarkConfig extends StObject {
    
    var options: js.UndefOr[RemarkOptions] = js.native
    
    var resolve: `gatsby-transformer-remark` = js.native
  }
  object RemarkConfig {
    
    @scala.inline
    def apply(resolve: `gatsby-transformer-remark`): RemarkConfig = {
      val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemarkConfig]
    }
    
    @scala.inline
    implicit class RemarkConfigMutableBuilder[Self <: RemarkConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: RemarkOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setResolve(value: `gatsby-transformer-remark`): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemarkOptions extends StObject {
    
    /** CommonMark mode (default: true) */
    var commonmark: js.UndefOr[Boolean] = js.native
    
    /**
      * @see https://www.gatsbyjs.com/plugins/gatsby-transformer-remark/#example-excerpts
      */
    var excerpt_separator: js.UndefOr[String] = js.native
    
    /** Footnotes mode (default: true) */
    var footnotes: js.UndefOr[Boolean] = js.native
    
    /** GitHub Flavored Markdown mode (default: true) */
    var gfm: js.UndefOr[Boolean] = js.native
    
    /** Pedantic mode (default: true) */
    var pedantic: js.UndefOr[Boolean] = js.native
    
    /** Plugins configs */
    var plugins: js.UndefOr[js.Array[_]] = js.native
    
    /**
      * Pass default options to the plugin generating tableOfContents
      * @see https://www.gatsbyjs.com/plugins/gatsby-transformer-remark/#configuring-the-tableofcontents
      */
    var tableOfContents: js.UndefOr[Absolute] = js.native
  }
  object RemarkOptions {
    
    @scala.inline
    def apply(): RemarkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemarkOptions]
    }
    
    @scala.inline
    implicit class RemarkOptionsMutableBuilder[Self <: RemarkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommonmark(value: Boolean): Self = StObject.set(x, "commonmark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonmarkUndefined: Self = StObject.set(x, "commonmark", js.undefined)
      
      @scala.inline
      def setExcerpt_separator(value: String): Self = StObject.set(x, "excerpt_separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcerpt_separatorUndefined: Self = StObject.set(x, "excerpt_separator", js.undefined)
      
      @scala.inline
      def setFootnotes(value: Boolean): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFootnotesUndefined: Self = StObject.set(x, "footnotes", js.undefined)
      
      @scala.inline
      def setGfm(value: Boolean): Self = StObject.set(x, "gfm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGfmUndefined: Self = StObject.set(x, "gfm", js.undefined)
      
      @scala.inline
      def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[_]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setTableOfContents(value: Absolute): Self = StObject.set(x, "tableOfContents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableOfContentsUndefined: Self = StObject.set(x, "tableOfContents", js.undefined)
    }
  }
}
