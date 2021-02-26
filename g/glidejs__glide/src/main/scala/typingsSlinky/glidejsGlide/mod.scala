package typingsSlinky.glidejsGlide

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.glidejsGlide.anon.ActiveNav
import typingsSlinky.glidejsGlide.anon.After
import typingsSlinky.glidejsGlide.anon.Modify
import typingsSlinky.glidejsGlide.anon.Mount
import typingsSlinky.glidejsGlide.glidejsGlideBooleans.`false`
import typingsSlinky.glidejsGlide.glidejsGlideStrings.ltr
import typingsSlinky.glidejsGlide.glidejsGlideStrings.rtr
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@glidejs/glide", JSImport.Namespace)
  @js.native
  class ^ protected () extends Static {
    // tslint:disable-next-line:no-misused-new
    def this(selector: String) = this()
    def this(selector: String, options: Options) = this()
  }
  @JSImport("@glidejs/glide", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  /**
    * The component is a simple function that returns an object. Each component
    * has a single responsibility and communicates with other components using
    * events.
    */
  type ComponentFunction = js.Function3[/* glide */ Static, /* components */ js.Object, /* events */ js.Any, Mount]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.mountDotbefore
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.mountDotafter
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.update
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.play
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.pause
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.buildDotbefore
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.buildDotafter
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotbefore
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.run
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotafter
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotoffset
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotstart
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotend
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.move
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.moveDotafter
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.resize
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.swipeDotstart
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.swipeDotmove
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.swipeDotend
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.translateDotjump
  */
  trait Events extends StObject
  object Events {
    
    @scala.inline
    def buildDotafter: typingsSlinky.glidejsGlide.glidejsGlideStrings.buildDotafter = "build.after".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.buildDotafter]
    
    @scala.inline
    def buildDotbefore: typingsSlinky.glidejsGlide.glidejsGlideStrings.buildDotbefore = "build.before".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.buildDotbefore]
    
    @scala.inline
    def mountDotafter: typingsSlinky.glidejsGlide.glidejsGlideStrings.mountDotafter = "mount.after".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.mountDotafter]
    
    @scala.inline
    def mountDotbefore: typingsSlinky.glidejsGlide.glidejsGlideStrings.mountDotbefore = "mount.before".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.mountDotbefore]
    
    @scala.inline
    def move: typingsSlinky.glidejsGlide.glidejsGlideStrings.move = "move".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.move]
    
    @scala.inline
    def moveDotafter: typingsSlinky.glidejsGlide.glidejsGlideStrings.moveDotafter = "move.after".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.moveDotafter]
    
    @scala.inline
    def pause: typingsSlinky.glidejsGlide.glidejsGlideStrings.pause = "pause".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.pause]
    
    @scala.inline
    def play: typingsSlinky.glidejsGlide.glidejsGlideStrings.play = "play".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.play]
    
    @scala.inline
    def resize: typingsSlinky.glidejsGlide.glidejsGlideStrings.resize = "resize".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.resize]
    
    @scala.inline
    def run: typingsSlinky.glidejsGlide.glidejsGlideStrings.run = "run".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.run]
    
    @scala.inline
    def runDotafter: typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotafter = "run.after".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotafter]
    
    @scala.inline
    def runDotbefore: typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotbefore = "run.before".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotbefore]
    
    @scala.inline
    def runDotend: typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotend = "run.end".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotend]
    
    @scala.inline
    def runDotoffset: typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotoffset = "run.offset".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotoffset]
    
    @scala.inline
    def runDotstart: typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotstart = "run.start".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.runDotstart]
    
    @scala.inline
    def swipeDotend: typingsSlinky.glidejsGlide.glidejsGlideStrings.swipeDotend = "swipe.end".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.swipeDotend]
    
    @scala.inline
    def swipeDotmove: typingsSlinky.glidejsGlide.glidejsGlideStrings.swipeDotmove = "swipe.move".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.swipeDotmove]
    
    @scala.inline
    def swipeDotstart: typingsSlinky.glidejsGlide.glidejsGlideStrings.swipeDotstart = "swipe.start".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.swipeDotstart]
    
    @scala.inline
    def translateDotjump: typingsSlinky.glidejsGlide.glidejsGlideStrings.translateDotjump = "translate.jump".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.translateDotjump]
    
    @scala.inline
    def update: typingsSlinky.glidejsGlide.glidejsGlideStrings.update = "update".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.update]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Duration of the animation
      *
      * @default 400
      */
    var animationDuration: js.UndefOr[Double] = js.native
    
    /**
      * Easing function for the animation
      *
      * @default 'cubic-bezier(0.165, 0.840, 0.440, 1.000)
      */
    var animationTimingFunc: js.UndefOr[String] = js.native
    
    /**
      * Change slides after a specified interval
      *
      * @default false
      */
    var autoplay: js.UndefOr[`false` | Double] = js.native
    
    /**
      * Stop running perView number of slides from the end
      *
      * @default false
      */
    var bound: js.UndefOr[Boolean] = js.native
    
    /**
      * Collection of options applied at specified media breakpoints
      *
      * @default {}
      */
    var breakpoints: js.UndefOr[Record[Double, Options]] = js.native
    
    /**
      * Collection of used HTML classes
      */
    var classes: js.UndefOr[ActiveNav] = js.native
    
    /**
      * Moving direction mode
      *
      * @default 'ltr'
      */
    var direction: js.UndefOr[ltr | rtr] = js.native
    
    /**
      * Minimal mousedrag distance needed to change the slide
      *
      * @default 120
      */
    var dragThreshold: js.UndefOr[Double | `false`] = js.native
    
    /**
      * Focus currently active slide at a specified position
      *
      * @default 0
      */
    var focusAt: js.UndefOr[Double | String] = js.native
    
    /**
      * A size of the space between slides
      *
      * @default 10
      */
    var gap: js.UndefOr[Double] = js.native
    
    /**
      * Stop autoplay on mouseover
      *
      * @default true
      */
    var hoverpause: js.UndefOr[Boolean] = js.native
    
    /**
      * Change slides with keyboard arrows
      *
      * @default true
      */
    var keyboard: js.UndefOr[Boolean] = js.native
    
    /**
      * The value of the future viewports which have to be visible in the
      * current view
      *
      * @default 0
      */
    var peek: js.UndefOr[Double | After] = js.native
    
    /**
      * A maximum number of slides moved per single swipe or drag
      *
      * @default false
      */
    var perTouch: js.UndefOr[Double | `false`] = js.native
    
    /**
      * A number of visible slides
      *
      * @default 1
      */
    var perView: js.UndefOr[Double] = js.native
    
    /**
      * Allow looping the slider type
      *
      * @default true
      */
    var rewind: js.UndefOr[Boolean] = js.native
    
    /**
      * Duration of the rewinding animation
      *
      * @default 800
      */
    var rewindDuration: js.UndefOr[Double] = js.native
    
    /**
      * Start at specific slide number
      *
      * @default 0
      */
    var startAt: js.UndefOr[Double] = js.native
    
    /**
      * Minimal swipe distance needed to change the slide
      *
      * @default 80
      */
    var swipeThreshold: js.UndefOr[Double | `false`] = js.native
    
    /**
      * Throttle costly events
      *
      * @default 25
      */
    var throttle: js.UndefOr[Double] = js.native
    
    /**
      * Angle required to activate slides moving
      *
      * @default 45
      */
    var touchAngle: js.UndefOr[Double] = js.native
    
    /**
      * Alternate moving distance ratio of swiping and dragging
      *
      * @default 0.5
      */
    var touchRatio: js.UndefOr[Double] = js.native
    
    /**
      * Type of the movement
      *
      * @default 'slider'
      */
    var `type`: js.UndefOr[Type] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setAnimationTimingFunc(value: String): Self = StObject.set(x, "animationTimingFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationTimingFuncUndefined: Self = StObject.set(x, "animationTimingFunc", js.undefined)
      
      @scala.inline
      def setAutoplay(value: `false` | Double): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setBound(value: Boolean): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundUndefined: Self = StObject.set(x, "bound", js.undefined)
      
      @scala.inline
      def setBreakpoints(value: Record[Double, Options]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      @scala.inline
      def setClasses(value: ActiveNav): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtr): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDragThreshold(value: Double | `false`): Self = StObject.set(x, "dragThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragThresholdUndefined: Self = StObject.set(x, "dragThreshold", js.undefined)
      
      @scala.inline
      def setFocusAt(value: Double | String): Self = StObject.set(x, "focusAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusAtUndefined: Self = StObject.set(x, "focusAt", js.undefined)
      
      @scala.inline
      def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setHoverpause(value: Boolean): Self = StObject.set(x, "hoverpause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverpauseUndefined: Self = StObject.set(x, "hoverpause", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setPeek(value: Double | After): Self = StObject.set(x, "peek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeekUndefined: Self = StObject.set(x, "peek", js.undefined)
      
      @scala.inline
      def setPerTouch(value: Double | `false`): Self = StObject.set(x, "perTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerTouchUndefined: Self = StObject.set(x, "perTouch", js.undefined)
      
      @scala.inline
      def setPerView(value: Double): Self = StObject.set(x, "perView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerViewUndefined: Self = StObject.set(x, "perView", js.undefined)
      
      @scala.inline
      def setRewind(value: Boolean): Self = StObject.set(x, "rewind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewindDuration(value: Double): Self = StObject.set(x, "rewindDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewindDurationUndefined: Self = StObject.set(x, "rewindDuration", js.undefined)
      
      @scala.inline
      def setRewindUndefined: Self = StObject.set(x, "rewind", js.undefined)
      
      @scala.inline
      def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      @scala.inline
      def setSwipeThreshold(value: Double | `false`): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      @scala.inline
      def setTouchAngle(value: Double): Self = StObject.set(x, "touchAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchAngleUndefined: Self = StObject.set(x, "touchAngle", js.undefined)
      
      @scala.inline
      def setTouchRatio(value: Double): Self = StObject.set(x, "touchRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchRatioUndefined: Self = StObject.set(x, "touchRatio", js.undefined)
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.Greaterthansign
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.Lessthansign
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.GreaterthansignGreaterthansign
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.LessthansignLessthansign
    - java.lang.String
  */
  type Pattern = _Pattern | String
  
  @js.native
  trait Properties extends StObject {
    
    /**
      * Destroy instance and undo all modifications which have been made to
      * the DOM. It also unbinds added event listeners.
      */
    def destroy(): Unit = js.native
    
    /**
      * Disable instance interaction. Blocks ability to manually change
      * slides via controls or API.
      */
    def disable(): Unit = js.native
    
    /**
      * Holds state of the ability to interact.
      */
    var disabled: Boolean = js.native
    
    /**
      * Enable previously disabled instance. Start responding to interaction.
      */
    def enable(): Unit = js.native
    
    /**
      * Make movement based on the defined pattern. A pattern must be in the
      * special format
      */
    def go(pattern: Pattern): Unit = js.native
    
    /**
      * Holds currently active zero-based slide index.
      */
    var index: Double = js.native
    
    /**
      * Verify the type of a Glide instance.
      */
    def isType(`type`: Type): Boolean = js.native
    
    /**
      * Stop auto-playing. Hold changing slides after a defined interval.
      */
    def pause(): Unit = js.native
    
    /**
      * Force to run auto-playing with passed interval
      */
    def play(): Unit = js.native
    def play(force: Double): Unit = js.native
    
    /**
      * Holds instance initialization settings.
      */
    var settings: Options = js.native
    
    /**
      * Holds type of the Glide instance.
      */
    var `type`: Type = js.native
    
    /**
      * Update settings for the Glide instance.
      */
    def update(settings: Options): Unit = js.native
  }
  
  @js.native
  trait Static
    extends // tslint:disable-next-line:no-misused-new
  Instantiable1[/* selector */ String, Static]
       with Instantiable2[/* selector */ String, /* options */ Options, Static] {
    
    /**
      * A Glide instance is in "uninitialized" mode until a mount() method
      * call. It starts an entire building process.
      */
    def mount(): Properties = js.native
    def mount(components: Record[String, ComponentFunction]): Properties = js.native
    
    /**
      * Registering Transformers
      */
    def mutate(transformers: js.Array[TransformerFunction]): Static = js.native
    
    def on(event: js.Array[Events], definition: js.Function0[Unit]): Unit = js.native
    /**
      * Register callback which will be called at the specified events.
      */
    def on(event: Events, definition: js.Function0[Unit]): Unit = js.native
  }
  
  type TransformerFunction = js.Function3[/* glide */ Static, /* components */ js.Object, /* events */ js.Any, Modify]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.slider
    - typingsSlinky.glidejsGlide.glidejsGlideStrings.carousel
  */
  trait Type extends StObject
  object Type {
    
    @scala.inline
    def carousel: typingsSlinky.glidejsGlide.glidejsGlideStrings.carousel = "carousel".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.carousel]
    
    @scala.inline
    def slider: typingsSlinky.glidejsGlide.glidejsGlideStrings.slider = "slider".asInstanceOf[typingsSlinky.glidejsGlide.glidejsGlideStrings.slider]
  }
  
  trait _Pattern extends StObject
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
