package typingsSlinky.reactHelmetWithVisor

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLBodyElement
import org.scalajs.dom.raw.HTMLHtmlElement
import org.scalajs.dom.raw.HTMLLinkElement
import org.scalajs.dom.raw.HTMLMetaElement
import org.scalajs.dom.raw.HTMLScriptElement
import org.scalajs.dom.raw.HTMLStyleElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.HtmlHTMLAttributes
import typingsSlinky.react.mod.LinkHTMLAttributes
import typingsSlinky.react.mod.MetaHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-helmet-with-visor", JSImport.Default)
  @js.native
  class default protected () extends Helmet {
    def this(props: HelmetProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HelmetProps, context: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-helmet-with-visor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-helmet-with-visor", "default.canUseDOM")
    @js.native
    def canUseDOM: Boolean = js.native
    @scala.inline
    def canUseDOM_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canUseDOM")(x.asInstanceOf[js.Any])
    
    @JSImport("react-helmet-with-visor", "default.peek")
    @js.native
    def peek(): HelmetData = js.native
    
    @JSImport("react-helmet-with-visor", "default.renderStatic")
    @js.native
    def renderStatic(): HelmetData = js.native
    
    @JSImport("react-helmet-with-visor", "default.rewind")
    @js.native
    def rewind(): HelmetData = js.native
  }
  
  @JSImport("react-helmet-with-visor", "Helmet")
  @js.native
  class Helmet protected ()
    extends Component[HelmetProps, js.Object, js.Any] {
    def this(props: HelmetProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HelmetProps, context: js.Any) = this()
  }
  /* static members */
  object Helmet {
    
    @JSImport("react-helmet-with-visor", "Helmet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-helmet-with-visor", "Helmet.canUseDOM")
    @js.native
    def canUseDOM: Boolean = js.native
    @scala.inline
    def canUseDOM_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canUseDOM")(x.asInstanceOf[js.Any])
    
    @JSImport("react-helmet-with-visor", "Helmet.peek")
    @js.native
    def peek(): HelmetData = js.native
    
    @JSImport("react-helmet-with-visor", "Helmet.renderStatic")
    @js.native
    def renderStatic(): HelmetData = js.native
    
    @JSImport("react-helmet-with-visor", "Helmet.rewind")
    @js.native
    def rewind(): HelmetData = js.native
  }
  
  @JSImport("react-helmet-with-visor", "HelmetsOpenedVisor")
  @js.native
  class HelmetsOpenedVisor protected ()
    extends Component[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  
  @JSImport("react-helmet-with-visor", "canUseDOM")
  @js.native
  val canUseDOM: Boolean = js.native
  
  @JSImport("react-helmet-with-visor", "peek")
  @js.native
  def peek(): HelmetData = js.native
  
  @JSImport("react-helmet-with-visor", "renderStatic")
  @js.native
  def renderStatic(): HelmetData = js.native
  
  @JSImport("react-helmet-with-visor", "rewind")
  @js.native
  def rewind(): HelmetData = js.native
  
  type BodyProps = (DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement]) with OtherElementAttributes
  
  @js.native
  trait HelmetData extends StObject {
    
    var base: HelmetDatum = js.native
    
    var bodyAttributes: HelmetHTMLBodyDatum = js.native
    
    var htmlAttributes: HelmetHTMLElementDatum = js.native
    
    var link: HelmetDatum = js.native
    
    var meta: HelmetDatum = js.native
    
    var noscript: HelmetDatum = js.native
    
    var openedVisor: HelmetDatum = js.native
    
    var script: HelmetDatum = js.native
    
    var style: HelmetDatum = js.native
    
    var title: HelmetDatum = js.native
    
    var titleAttributes: HelmetDatum = js.native
  }
  object HelmetData {
    
    @scala.inline
    def apply(
      base: HelmetDatum,
      bodyAttributes: HelmetHTMLBodyDatum,
      htmlAttributes: HelmetHTMLElementDatum,
      link: HelmetDatum,
      meta: HelmetDatum,
      noscript: HelmetDatum,
      openedVisor: HelmetDatum,
      script: HelmetDatum,
      style: HelmetDatum,
      title: HelmetDatum,
      titleAttributes: HelmetDatum
    ): HelmetData = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], bodyAttributes = bodyAttributes.asInstanceOf[js.Any], htmlAttributes = htmlAttributes.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], openedVisor = openedVisor.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleAttributes = titleAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelmetData]
    }
    
    @scala.inline
    implicit class HelmetDataMutableBuilder[Self <: HelmetData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: HelmetDatum): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyAttributes(value: HelmetHTMLBodyDatum): Self = StObject.set(x, "bodyAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributes(value: HelmetHTMLElementDatum): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: HelmetDatum): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: HelmetDatum): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoscript(value: HelmetDatum): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenedVisor(value: HelmetDatum): Self = StObject.set(x, "openedVisor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScript(value: HelmetDatum): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: HelmetDatum): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: HelmetDatum): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAttributes(value: HelmetDatum): Self = StObject.set(x, "titleAttributes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HelmetDatum extends StObject {
    
    def toComponent(): ReactComponentClass[_] = js.native
  }
  object HelmetDatum {
    
    @scala.inline
    def apply(toComponent: () => ReactComponentClass[_]): HelmetDatum = {
      val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
      __obj.asInstanceOf[HelmetDatum]
    }
    
    @scala.inline
    implicit class HelmetDatumMutableBuilder[Self <: HelmetDatum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToComponent(value: () => ReactComponentClass[_]): Self = StObject.set(x, "toComponent", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait HelmetHTMLBodyDatum extends StObject {
    
    def toComponent(): HTMLAttributes[HTMLBodyElement] = js.native
  }
  object HelmetHTMLBodyDatum {
    
    @scala.inline
    def apply(toComponent: () => HTMLAttributes[HTMLBodyElement]): HelmetHTMLBodyDatum = {
      val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
      __obj.asInstanceOf[HelmetHTMLBodyDatum]
    }
    
    @scala.inline
    implicit class HelmetHTMLBodyDatumMutableBuilder[Self <: HelmetHTMLBodyDatum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToComponent(value: () => HTMLAttributes[HTMLBodyElement]): Self = StObject.set(x, "toComponent", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait HelmetHTMLElementDatum extends StObject {
    
    def toComponent(): HTMLAttributes[HTMLHtmlElement] = js.native
  }
  object HelmetHTMLElementDatum {
    
    @scala.inline
    def apply(toComponent: () => HTMLAttributes[HTMLHtmlElement]): HelmetHTMLElementDatum = {
      val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
      __obj.asInstanceOf[HelmetHTMLElementDatum]
    }
    
    @scala.inline
    implicit class HelmetHTMLElementDatumMutableBuilder[Self <: HelmetHTMLElementDatum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToComponent(value: () => HTMLAttributes[HTMLHtmlElement]): Self = StObject.set(x, "toComponent", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait HelmetProps extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
    
    var base: js.UndefOr[js.Any] = js.native
    
    var bodyAttributes: js.UndefOr[BodyProps] = js.native
    
    var defaultTitle: js.UndefOr[String] = js.native
    
    var defer: js.UndefOr[Boolean] = js.native
    
    var encodeSpecialCharacters: js.UndefOr[Boolean] = js.native
    
    var htmlAttributes: js.UndefOr[HtmlProps] = js.native
    
    var link: js.UndefOr[js.Array[LinkProps]] = js.native
    
    var meta: js.UndefOr[js.Array[MetaProps]] = js.native
    
    var noscript: js.UndefOr[js.Array[_]] = js.native
    
    var onChangeClientState: js.UndefOr[
        js.Function3[/* newState */ js.Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags, Unit]
      ] = js.native
    
    var script: js.UndefOr[js.Array[_]] = js.native
    
    var style: js.UndefOr[js.Array[_]] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var titleAttributes: js.UndefOr[js.Object] = js.native
    
    var titleTemplate: js.UndefOr[String] = js.native
  }
  object HelmetProps {
    
    @scala.inline
    def apply(): HelmetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelmetProps]
    }
    
    @scala.inline
    implicit class HelmetPropsMutableBuilder[Self <: HelmetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setBase(value: js.Any): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setBodyAttributes(value: BodyProps): Self = StObject.set(x, "bodyAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyAttributesUndefined: Self = StObject.set(x, "bodyAttributes", js.undefined)
      
      @scala.inline
      def setDefaultTitle(value: String): Self = StObject.set(x, "defaultTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTitleUndefined: Self = StObject.set(x, "defaultTitle", js.undefined)
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setEncodeSpecialCharacters(value: Boolean): Self = StObject.set(x, "encodeSpecialCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeSpecialCharactersUndefined: Self = StObject.set(x, "encodeSpecialCharacters", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: HtmlProps): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setLink(value: js.Array[LinkProps]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setLinkVarargs(value: LinkProps*): Self = StObject.set(x, "link", js.Array(value :_*))
      
      @scala.inline
      def setMeta(value: js.Array[MetaProps]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setMetaVarargs(value: MetaProps*): Self = StObject.set(x, "meta", js.Array(value :_*))
      
      @scala.inline
      def setNoscript(value: js.Array[_]): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoscriptUndefined: Self = StObject.set(x, "noscript", js.undefined)
      
      @scala.inline
      def setNoscriptVarargs(value: js.Any*): Self = StObject.set(x, "noscript", js.Array(value :_*))
      
      @scala.inline
      def setOnChangeClientState(value: (/* newState */ js.Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags) => Unit): Self = StObject.set(x, "onChangeClientState", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeClientStateUndefined: Self = StObject.set(x, "onChangeClientState", js.undefined)
      
      @scala.inline
      def setScript(value: js.Array[_]): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      @scala.inline
      def setScriptVarargs(value: js.Any*): Self = StObject.set(x, "script", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: js.Array[_]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: js.Any*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAttributes(value: js.Object): Self = StObject.set(x, "titleAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAttributesUndefined: Self = StObject.set(x, "titleAttributes", js.undefined)
      
      @scala.inline
      def setTitleTemplate(value: String): Self = StObject.set(x, "titleTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleTemplateUndefined: Self = StObject.set(x, "titleTemplate", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait HelmetTags extends StObject {
    
    var baseTag: js.Array[_] = js.native
    
    var linkTags: js.Array[HTMLLinkElement] = js.native
    
    var metaTags: js.Array[HTMLMetaElement] = js.native
    
    var noscriptTags: js.Array[_] = js.native
    
    var openedVisorTags: js.Array[_] = js.native
    
    var scriptTags: js.Array[HTMLScriptElement] = js.native
    
    var styleTags: js.Array[HTMLStyleElement] = js.native
  }
  object HelmetTags {
    
    @scala.inline
    def apply(
      baseTag: js.Array[_],
      linkTags: js.Array[HTMLLinkElement],
      metaTags: js.Array[HTMLMetaElement],
      noscriptTags: js.Array[_],
      openedVisorTags: js.Array[_],
      scriptTags: js.Array[HTMLScriptElement],
      styleTags: js.Array[HTMLStyleElement]
    ): HelmetTags = {
      val __obj = js.Dynamic.literal(baseTag = baseTag.asInstanceOf[js.Any], linkTags = linkTags.asInstanceOf[js.Any], metaTags = metaTags.asInstanceOf[js.Any], noscriptTags = noscriptTags.asInstanceOf[js.Any], openedVisorTags = openedVisorTags.asInstanceOf[js.Any], scriptTags = scriptTags.asInstanceOf[js.Any], styleTags = styleTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelmetTags]
    }
    
    @scala.inline
    implicit class HelmetTagsMutableBuilder[Self <: HelmetTags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseTag(value: js.Array[_]): Self = StObject.set(x, "baseTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseTagVarargs(value: js.Any*): Self = StObject.set(x, "baseTag", js.Array(value :_*))
      
      @scala.inline
      def setLinkTags(value: js.Array[HTMLLinkElement]): Self = StObject.set(x, "linkTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkTagsVarargs(value: HTMLLinkElement*): Self = StObject.set(x, "linkTags", js.Array(value :_*))
      
      @scala.inline
      def setMetaTags(value: js.Array[HTMLMetaElement]): Self = StObject.set(x, "metaTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaTagsVarargs(value: HTMLMetaElement*): Self = StObject.set(x, "metaTags", js.Array(value :_*))
      
      @scala.inline
      def setNoscriptTags(value: js.Array[_]): Self = StObject.set(x, "noscriptTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoscriptTagsVarargs(value: js.Any*): Self = StObject.set(x, "noscriptTags", js.Array(value :_*))
      
      @scala.inline
      def setOpenedVisorTags(value: js.Array[_]): Self = StObject.set(x, "openedVisorTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenedVisorTagsVarargs(value: js.Any*): Self = StObject.set(x, "openedVisorTags", js.Array(value :_*))
      
      @scala.inline
      def setScriptTags(value: js.Array[HTMLScriptElement]): Self = StObject.set(x, "scriptTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptTagsVarargs(value: HTMLScriptElement*): Self = StObject.set(x, "scriptTags", js.Array(value :_*))
      
      @scala.inline
      def setStyleTags(value: js.Array[HTMLStyleElement]): Self = StObject.set(x, "styleTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleTagsVarargs(value: HTMLStyleElement*): Self = StObject.set(x, "styleTags", js.Array(value :_*))
    }
  }
  
  type HtmlProps = (DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]) with OtherElementAttributes
  
  type LinkProps = DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement]
  
  type MetaProps = DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement]
  
  type OtherElementAttributes = StringDictionary[js.UndefOr[String | Double | Boolean | Null]]
}
