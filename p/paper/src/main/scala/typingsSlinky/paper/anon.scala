package typingsSlinky.paper

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalajs.dom.raw.HTMLScriptElement
import typingsSlinky.paper.paper.Color
import typingsSlinky.paper.paper.CompoundPath
import typingsSlinky.paper.paper.PaperScope
import typingsSlinky.paper.paper.Path
import typingsSlinky.paper.paper.Path.Arc
import typingsSlinky.paper.paper.Path.Circle
import typingsSlinky.paper.paper.Path.Ellipse
import typingsSlinky.paper.paper.Path.Line
import typingsSlinky.paper.paper.Path.RegularPolygon
import typingsSlinky.paper.paper.Path.Star
import typingsSlinky.paper.paper.Point
import typingsSlinky.paper.paper.Rectangle
import typingsSlinky.paper.paper.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofColor extends StObject {
    
    /** 
      * Returns a color object with random {@link #red}, {@link #green}
      * and {@link #blue} values between `0` and `1`.
      * 
      * @return the newly created color object
      */
    /* static member */
    def random(): Color = js.native
  }
  object TypeofColor {
    
    @scala.inline
    def apply(random: () => Color): TypeofColor = {
      val __obj = js.Dynamic.literal(random = js.Any.fromFunction0(random))
      __obj.asInstanceOf[TypeofColor]
    }
    
    @scala.inline
    implicit class TypeofColorMutableBuilder[Self <: TypeofColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRandom(value: () => Color): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TypeofKey extends StObject {
    
    /** 
      * Checks whether the specified key is pressed.
      * 
      * @param key - any character or special key descriptor:
      *     {@values 'enter', 'space', 'shift', 'control', 'alt', 'meta',
      *     'caps-lock', 'left', 'up', 'right', 'down', 'escape', 'delete',
      *     ...}
      * 
      * @return true if the key is pressed
      */
    /* static member */
    def isDown(key: String): Boolean = js.native
    
    /** 
      * The current state of the keyboard modifiers.
      * 
      * @option modifiers.shift {Boolean} {@true if the shift key is
      *     pressed}.
      * @option modifiers.control {Boolean} {@true if the control key is
      *     pressed}.
      * @option modifiers.alt {Boolean} {@true if the alt/option key is
      *     pressed}.
      * @option modifiers.meta {Boolean} {@true if the meta/windows/command
      *     key is pressed}.
      * @option modifiers.capsLock {Boolean} {@true if the caps-lock key is
      *     active}.
      * @option modifiers.space {Boolean} {@true if the space key is
      *     pressed}.
      * @option modifiers.option {Boolean} {@true if the alt/option key is
      *     pressed}. This is the same as `modifiers.alt`
      * @option modifiers.command {Boolean} {@true if the meta key is pressed
      *     on Mac, or the control key is pressed on Windows and Linux}.
      */
    /* static member */
    var modifiers: js.Any = js.native
  }
  object TypeofKey {
    
    @scala.inline
    def apply(isDown: String => Boolean, modifiers: js.Any): TypeofKey = {
      val __obj = js.Dynamic.literal(isDown = js.Any.fromFunction1(isDown), modifiers = modifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofKey]
    }
    
    @scala.inline
    implicit class TypeofKeyMutableBuilder[Self <: TypeofKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDown(value: String => Boolean): Self = StObject.set(x, "isDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModifiers(value: js.Any): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofPaperScope extends StObject {
    
    /** 
      * Retrieves a PaperScope object with the given scope id.
      */
    /* static member */
    def get(id: js.Any): PaperScope = js.native
  }
  object TypeofPaperScope {
    
    @scala.inline
    def apply(get: js.Any => PaperScope): TypeofPaperScope = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[TypeofPaperScope]
    }
    
    @scala.inline
    implicit class TypeofPaperScopeMutableBuilder[Self <: TypeofPaperScope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: js.Any => PaperScope): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofPaperScript extends StObject {
    
    /** 
      * Compiles PaperScript code into JavaScript code.
      * 
      * @option options.url {String} the url of the source, for source-map
      *     generation
      * @option options.source {String} the source to be used for the source-
      *     mapping, in case the code that's passed in has already been mingled.
      * 
      * @param code - the PaperScript code
      * @param options - the compilation options
      * 
      * @return an object holding the compiled PaperScript translated
      *     into JavaScript code along with source-maps and other information.
      */
    /* static member */
    def compile(code: String): js.Object = js.native
    def compile(code: String, options: js.Object): js.Object = js.native
    
    /** 
      * Compiles the PaperScript code into a compiled function and executes it.
      * The compiled function receives all properties of the passed {@link
      * PaperScope} as arguments, to emulate a global scope with unaffected
      * performance. It also installs global view and tool handlers automatically
      * on the respective objects.
      * 
      * @option options.url {String} the url of the source, for source-map
      *     generation
      * @option options.source {String} the source to be used for the source-
      *     mapping, in case the code that's passed in has already been mingled.
      * 
      * @param code - the PaperScript code
      * @param scope - the scope for which the code is executed
      * @param options - the compilation options
      * 
      * @return the exports defined in the executed code
      */
    /* static member */
    def execute(code: String, scope: PaperScope): js.Object = js.native
    def execute(code: String, scope: PaperScope, options: js.Object): js.Object = js.native
    
    /** 
      * Loads, compiles and executes PaperScript code in the HTML document. Note
      * that this method is executed automatically for all scripts in the
      * document through a window load event. You can optionally call it earlier
      * (e.g. from a DOM ready event), or you can mark scripts to be ignored by
      * setting the attribute `ignore="true"` or `data-paper-ignore="true"`, and
      * call the `PaperScript.load(script)` method for each script separately
      * when needed.
      * 
      * @param script - the script to load. If none is
      *     provided, all scripts of the HTML document are iterated over and
      *     loaded
      * 
      * @return the scope produced for the passed `script`, or
      *     `undefined` of multiple scripts area loaded
      */
    /* static member */
    def load(): PaperScope = js.native
    def load(script: HTMLScriptElement): PaperScope = js.native
  }
  
  @js.native
  trait TypeofPath extends StObject {
    
    var Arc: Instantiable3[
        /* from */ Point, 
        /* through */ Point, 
        /* to */ Point, 
        typingsSlinky.paper.paper.Path.Arc
      ] = js.native
    
    var Circle: Instantiable2[/* center */ Point, /* radius */ Double, typingsSlinky.paper.paper.Path.Circle] = js.native
    
    var Ellipse: Instantiable1[/* rectangle */ Rectangle, typingsSlinky.paper.paper.Path.Ellipse] = js.native
    
    var Line: Instantiable2[/* from */ Point, /* to */ Point, typingsSlinky.paper.paper.Path.Line] = js.native
    
    var Rectangle: Instantiable2[
        /* rectangle */ typingsSlinky.paper.paper.Rectangle, 
        /* radius */ js.UndefOr[Size], 
        typingsSlinky.paper.paper.Path.Rectangle
      ] = js.native
    
    var RegularPolygon: Instantiable3[
        /* center */ Point, 
        /* sides */ Double, 
        /* radius */ Double, 
        typingsSlinky.paper.paper.Path.RegularPolygon
      ] = js.native
    
    var Star: Instantiable4[
        /* center */ Point, 
        /* points */ Double, 
        /* radius1 */ Double, 
        /* radius2 */ Double, 
        typingsSlinky.paper.paper.Path.Star
      ] = js.native
  }
  object TypeofPath {
    
    @scala.inline
    def apply(
      Arc: Instantiable3[/* from */ Point, /* through */ Point, /* to */ Point, Arc],
      Circle: Instantiable2[/* center */ Point, /* radius */ Double, Circle],
      Ellipse: Instantiable1[/* rectangle */ Rectangle, Ellipse],
      Line: Instantiable2[/* from */ Point, /* to */ Point, Line],
      Rectangle: Instantiable2[
          /* rectangle */ Rectangle, 
          /* radius */ js.UndefOr[Size], 
          typingsSlinky.paper.paper.Path.Rectangle
        ],
      RegularPolygon: Instantiable3[/* center */ Point, /* sides */ Double, /* radius */ Double, RegularPolygon],
      Star: Instantiable4[
          /* center */ Point, 
          /* points */ Double, 
          /* radius1 */ Double, 
          /* radius2 */ Double, 
          Star
        ]
    ): TypeofPath = {
      val __obj = js.Dynamic.literal(Arc = Arc.asInstanceOf[js.Any], Circle = Circle.asInstanceOf[js.Any], Ellipse = Ellipse.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any], RegularPolygon = RegularPolygon.asInstanceOf[js.Any], Star = Star.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofPath]
    }
    
    @scala.inline
    implicit class TypeofPathMutableBuilder[Self <: TypeofPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArc(value: Instantiable3[/* from */ Point, /* through */ Point, /* to */ Point, Arc]): Self = StObject.set(x, "Arc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircle(value: Instantiable2[/* center */ Point, /* radius */ Double, Circle]): Self = StObject.set(x, "Circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipse(value: Instantiable1[/* rectangle */ Rectangle, Ellipse]): Self = StObject.set(x, "Ellipse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Instantiable2[/* from */ Point, /* to */ Point, Line]): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectangle(
        value: Instantiable2[
              /* rectangle */ Rectangle, 
              /* radius */ js.UndefOr[Size], 
              typingsSlinky.paper.paper.Path.Rectangle
            ]
      ): Self = StObject.set(x, "Rectangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegularPolygon(value: Instantiable3[/* center */ Point, /* sides */ Double, /* radius */ Double, RegularPolygon]): Self = StObject.set(x, "RegularPolygon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStar(
        value: Instantiable4[
              /* center */ Point, 
              /* points */ Double, 
              /* radius1 */ Double, 
              /* radius2 */ Double, 
              Star
            ]
      ): Self = StObject.set(x, "Star", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofPathItem extends StObject {
    
    /** 
      * Creates a path item from the given object, determining if the
      * contained information describes a plain path or a compound-path with
      * multiple sub-paths.
      * 
      * @param object - an object containing the properties describing
      *     the item to be created
      * 
      * @return the newly created path item
      */
    /* static member */
    def create(`object`: js.Object): Path | CompoundPath = js.native
    /** 
      * Creates a path item from the given SVG path-data, determining if the
      * data describes a plain path or a compound-path with multiple
      * sub-paths.
      * 
      * @param pathData - the SVG path-data to parse
      * 
      * @return the newly created path item
      */
    /* static member */
    def create(pathData: String): Path | CompoundPath = js.native
    /** 
      * Creates a path item from the given segments array, determining if the
      * array describes a plain path or a compound-path with multiple
      * sub-paths.
      * 
      * @param segments - the segments array to parse
      * 
      * @return the newly created path item
      */
    /* static member */
    def create(segments: js.Array[js.Array[Double]]): Path | CompoundPath = js.native
  }
  
  @js.native
  trait TypeofPoint extends StObject {
    
    /** 
      * Returns a new point object with the largest {@link #x} and
      * {@link #y} of the supplied points.
      * 
      * @return the newly created point object
      */
    /* static member */
    def max(point1: Point, point2: Point): Point = js.native
    
    /** 
      * Returns a new point object with the smallest {@link #x} and
      * {@link #y} of the supplied points.
      * 
      * @return the newly created point object
      */
    /* static member */
    def min(point1: Point, point2: Point): Point = js.native
    
    /** 
      * Returns a point object with random {@link #x} and {@link #y} values
      * between `0` and `1`.
      * 
      * @return the newly created point object
      */
    /* static member */
    def random(): Point = js.native
  }
  object TypeofPoint {
    
    @scala.inline
    def apply(max: (Point, Point) => Point, min: (Point, Point) => Point, random: () => Point): TypeofPoint = {
      val __obj = js.Dynamic.literal(max = js.Any.fromFunction2(max), min = js.Any.fromFunction2(min), random = js.Any.fromFunction0(random))
      __obj.asInstanceOf[TypeofPoint]
    }
    
    @scala.inline
    implicit class TypeofPointMutableBuilder[Self <: TypeofPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: (Point, Point) => Point): Self = StObject.set(x, "max", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMin(value: (Point, Point) => Point): Self = StObject.set(x, "min", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRandom(value: () => Point): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TypeofShape extends StObject {
    
    var Circle: Instantiable2[/* center */ Point, /* radius */ Double, typingsSlinky.paper.paper.Shape.Circle] = js.native
    
    var Ellipse: Instantiable1[/* rectangle */ Rectangle, typingsSlinky.paper.paper.Shape.Ellipse] = js.native
    
    var Rectangle: Instantiable2[
        /* rectangle */ typingsSlinky.paper.paper.Rectangle, 
        /* radius */ js.UndefOr[Size], 
        typingsSlinky.paper.paper.Shape.Rectangle
      ] = js.native
  }
  object TypeofShape {
    
    @scala.inline
    def apply(
      Circle: Instantiable2[/* center */ Point, /* radius */ Double, typingsSlinky.paper.paper.Shape.Circle],
      Ellipse: Instantiable1[/* rectangle */ Rectangle, typingsSlinky.paper.paper.Shape.Ellipse],
      Rectangle: Instantiable2[
          /* rectangle */ Rectangle, 
          /* radius */ js.UndefOr[Size], 
          typingsSlinky.paper.paper.Shape.Rectangle
        ]
    ): TypeofShape = {
      val __obj = js.Dynamic.literal(Circle = Circle.asInstanceOf[js.Any], Ellipse = Ellipse.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofShape]
    }
    
    @scala.inline
    implicit class TypeofShapeMutableBuilder[Self <: TypeofShape] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircle(
        value: Instantiable2[/* center */ Point, /* radius */ Double, typingsSlinky.paper.paper.Shape.Circle]
      ): Self = StObject.set(x, "Circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipse(value: Instantiable1[/* rectangle */ Rectangle, typingsSlinky.paper.paper.Shape.Ellipse]): Self = StObject.set(x, "Ellipse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectangle(
        value: Instantiable2[
              /* rectangle */ Rectangle, 
              /* radius */ js.UndefOr[Size], 
              typingsSlinky.paper.paper.Shape.Rectangle
            ]
      ): Self = StObject.set(x, "Rectangle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofSize extends StObject {
    
    /** 
      * Returns a new size object with the largest {@link #width} and
      * {@link #height} of the supplied sizes.
      * 
      * @return the newly created size object
      */
    /* static member */
    def max(size1: Size, size2: Size): Size = js.native
    
    /** 
      * Returns a new size object with the smallest {@link #width} and
      * {@link #height} of the supplied sizes.
      * 
      * @return the newly created size object
      */
    /* static member */
    def min(size1: Size, size2: Size): Size = js.native
    
    /** 
      * Returns a size object with random {@link #width} and {@link #height}
      * values between `0` and `1`.
      * 
      * @return the newly created size object
      */
    /* static member */
    def random(): Size = js.native
  }
  object TypeofSize {
    
    @scala.inline
    def apply(max: (Size, Size) => Size, min: (Size, Size) => Size, random: () => Size): TypeofSize = {
      val __obj = js.Dynamic.literal(max = js.Any.fromFunction2(max), min = js.Any.fromFunction2(min), random = js.Any.fromFunction0(random))
      __obj.asInstanceOf[TypeofSize]
    }
    
    @scala.inline
    implicit class TypeofSizeMutableBuilder[Self <: TypeofSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: (Size, Size) => Size): Self = StObject.set(x, "max", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMin(value: (Size, Size) => Size): Self = StObject.set(x, "min", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRandom(value: () => Size): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
    }
  }
}
