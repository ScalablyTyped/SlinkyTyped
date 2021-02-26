package typingsSlinky.nodeSpriteGenerator

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.nodeSpriteGenerator.anon.xnumberynumberImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-sprite-generator", JSImport.Namespace)
  @js.native
  def apply(option: Option): Unit = js.native
  @JSImport("node-sprite-generator", JSImport.Namespace)
  @js.native
  def apply(option: Option, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  @JSImport("node-sprite-generator", "middleware")
  @js.native
  def middleware(option: Option): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.canvas
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.gm
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.jimp
  */
  trait BuiltinCompositors extends StObject
  object BuiltinCompositors {
    
    @scala.inline
    def canvas: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.canvas = "canvas".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.canvas]
    
    @scala.inline
    def gm: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.gm = "gm".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.gm]
    
    @scala.inline
    def jimp: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.jimp = "jimp".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.jimp]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.packed
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.vertical
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.horizontal
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.diagonal
  */
  trait BuiltinLayouts extends StObject
  object BuiltinLayouts {
    
    @scala.inline
    def diagonal: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.diagonal = "diagonal".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.diagonal]
    
    @scala.inline
    def horizontal: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.horizontal = "horizontal".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.horizontal]
    
    @scala.inline
    def packed: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.packed = "packed".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.packed]
    
    @scala.inline
    def vertical: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.vertical = "vertical".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.stylus
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.less
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sass
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.scss
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.css
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.`prefixed-css`
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.javascript
  */
  trait BuiltinStylesheetFormats extends StObject
  object BuiltinStylesheetFormats {
    
    @scala.inline
    def css: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.css = "css".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.css]
    
    @scala.inline
    def javascript: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.javascript = "javascript".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.javascript]
    
    @scala.inline
    def less: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.less = "less".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.less]
    
    @scala.inline
    def `prefixed-css`: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.`prefixed-css` = "prefixed-css".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.`prefixed-css`]
    
    @scala.inline
    def sass: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sass = "sass".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sass]
    
    @scala.inline
    def scss: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.scss = "scss".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.scss]
    
    @scala.inline
    def stylus: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.stylus = "stylus".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.stylus]
  }
  
  @js.native
  trait Compositor extends StObject {
    
    def readImages(
      files: js.Array[String],
      callback: js.Function2[/* error */ js.Error, /* images */ js.Array[Image], Unit]
    ): Unit = js.native
    
    def render(
      layout: Layout,
      spritePath: String,
      options: CompositorOption,
      callback: js.Function1[/* error */ js.Error, Unit]
    ): Unit = js.native
  }
  object Compositor {
    
    @scala.inline
    def apply(
      readImages: (js.Array[String], js.Function2[/* error */ js.Error, /* images */ js.Array[Image], Unit]) => Unit,
      render: (Layout, String, CompositorOption, js.Function1[/* error */ js.Error, Unit]) => Unit
    ): Compositor = {
      val __obj = js.Dynamic.literal(readImages = js.Any.fromFunction2(readImages), render = js.Any.fromFunction4(render))
      __obj.asInstanceOf[Compositor]
    }
    
    @scala.inline
    implicit class CompositorMutableBuilder[Self <: Compositor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadImages(
        value: (js.Array[String], js.Function2[/* error */ js.Error, /* images */ js.Array[Image], Unit]) => Unit
      ): Self = StObject.set(x, "readImages", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRender(value: (Layout, String, CompositorOption, js.Function1[/* error */ js.Error, Unit]) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction4(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.all
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.none
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sub
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.up
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.average
    - typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.paeth
  */
  trait CompositorFilters extends StObject
  object CompositorFilters {
    
    @scala.inline
    def all: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.all = "all".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.all]
    
    @scala.inline
    def average: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.average = "average".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.average]
    
    @scala.inline
    def none: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.none = "none".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.none]
    
    @scala.inline
    def paeth: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.paeth = "paeth".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.paeth]
    
    @scala.inline
    def sub: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sub = "sub".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.sub]
    
    @scala.inline
    def up: typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.up = "up".asInstanceOf[typingsSlinky.nodeSpriteGenerator.nodeSpriteGeneratorStrings.up]
  }
  
  @js.native
  trait CompositorOption extends StObject {
    
    var compressionLevel: js.UndefOr[Double] = js.native
    
    var filter: js.UndefOr[CompositorFilters] = js.native
  }
  object CompositorOption {
    
    @scala.inline
    def apply(): CompositorOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositorOption]
    }
    
    @scala.inline
    implicit class CompositorOptionMutableBuilder[Self <: CompositorOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompressionLevel(value: Double): Self = StObject.set(x, "compressionLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionLevelUndefined: Self = StObject.set(x, "compressionLevel", js.undefined)
      
      @scala.inline
      def setFilter(value: CompositorFilters): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  @js.native
  trait Image extends StObject {
    
    var data: js.Any = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Image {
    
    @scala.inline
    def apply(data: js.Any, height: Double, width: Double): Image = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Layout extends StObject {
    
    var height: Double = js.native
    
    var images: js.Array[xnumberynumberImage] = js.native
    
    var width: Double = js.native
  }
  object Layout {
    
    @scala.inline
    def apply(height: Double, images: js.Array[xnumberynumberImage], width: Double): Layout = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    @scala.inline
    implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImages(value: js.Array[xnumberynumberImage]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesVarargs(value: xnumberynumberImage*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type LayoutFunc = js.Function3[
    /* images */ js.Array[Image], 
    /* options */ LayoutOption, 
    /* callback */ js.Function2[/* error */ js.Error, /* layout */ Layout, Unit], 
    Unit
  ]
  
  @js.native
  trait LayoutOption extends StObject {
    
    var padding: js.UndefOr[Double] = js.native
    
    var scaling: js.UndefOr[Double] = js.native
  }
  object LayoutOption {
    
    @scala.inline
    def apply(): LayoutOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutOption]
    }
    
    @scala.inline
    implicit class LayoutOptionMutableBuilder[Self <: LayoutOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setScaling(value: Double): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    }
  }
  
  @js.native
  trait Option extends StObject {
    
    var compositor: js.UndefOr[BuiltinCompositors | Compositor] = js.native
    
    var compositorOptions: js.UndefOr[CompositorOption] = js.native
    
    var layout: js.UndefOr[BuiltinLayouts | LayoutFunc] = js.native
    
    var layoutOptions: js.UndefOr[LayoutOption] = js.native
    
    var spritePath: js.UndefOr[String] = js.native
    
    var src: js.UndefOr[js.Array[String]] = js.native
    
    var stylesheet: js.UndefOr[BuiltinStylesheetFormats | StylesheetFunc | String] = js.native
    
    var stylesheetOptions: js.UndefOr[StylesheetOption] = js.native
    
    var stylesheetPath: js.UndefOr[String] = js.native
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompositor(value: BuiltinCompositors | Compositor): Self = StObject.set(x, "compositor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompositorOptions(value: CompositorOption): Self = StObject.set(x, "compositorOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompositorOptionsUndefined: Self = StObject.set(x, "compositorOptions", js.undefined)
      
      @scala.inline
      def setCompositorUndefined: Self = StObject.set(x, "compositor", js.undefined)
      
      @scala.inline
      def setLayout(value: BuiltinLayouts | LayoutFunc): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutFunction3(
        value: (/* images */ js.Array[Image], /* options */ LayoutOption, /* callback */ js.Function2[/* error */ js.Error, /* layout */ Layout, Unit]) => Unit
      ): Self = StObject.set(x, "layout", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLayoutOptions(value: LayoutOption): Self = StObject.set(x, "layoutOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutOptionsUndefined: Self = StObject.set(x, "layoutOptions", js.undefined)
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setSpritePath(value: String): Self = StObject.set(x, "spritePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpritePathUndefined: Self = StObject.set(x, "spritePath", js.undefined)
      
      @scala.inline
      def setSrc(value: js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
      
      @scala.inline
      def setStylesheet(value: BuiltinStylesheetFormats | StylesheetFunc | String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesheetFunction5(
        value: (/* layout */ Layout, /* stylesheetPath */ String, /* spritePath */ String, /* options */ StylesheetOption, /* callback */ js.Function1[/* error */ js.Error, Unit]) => Unit
      ): Self = StObject.set(x, "stylesheet", js.Any.fromFunction5(value))
      
      @scala.inline
      def setStylesheetOptions(value: StylesheetOption): Self = StObject.set(x, "stylesheetOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesheetOptionsUndefined: Self = StObject.set(x, "stylesheetOptions", js.undefined)
      
      @scala.inline
      def setStylesheetPath(value: String): Self = StObject.set(x, "stylesheetPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesheetPathUndefined: Self = StObject.set(x, "stylesheetPath", js.undefined)
      
      @scala.inline
      def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
    }
  }
  
  type StylesheetFunc = js.Function5[
    /* layout */ Layout, 
    /* stylesheetPath */ String, 
    /* spritePath */ String, 
    /* options */ StylesheetOption, 
    /* callback */ js.Function1[/* error */ js.Error, Unit], 
    Unit
  ]
  
  @js.native
  trait StylesheetOption extends StObject {
    
    var nameMapping: js.UndefOr[js.Function0[String]] = js.native
    
    var pixelRatio: js.UndefOr[Double] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var spritePath: js.UndefOr[String] = js.native
  }
  object StylesheetOption {
    
    @scala.inline
    def apply(): StylesheetOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylesheetOption]
    }
    
    @scala.inline
    implicit class StylesheetOptionMutableBuilder[Self <: StylesheetOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNameMapping(value: () => String): Self = StObject.set(x, "nameMapping", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNameMappingUndefined: Self = StObject.set(x, "nameMapping", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSpritePath(value: String): Self = StObject.set(x, "spritePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpritePathUndefined: Self = StObject.set(x, "spritePath", js.undefined)
    }
  }
}
