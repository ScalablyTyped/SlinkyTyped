package typingsSlinky.phaser.phaserMod

import typingsSlinky.phaser.Phaser.Types.Core.FPSConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  /**
    * The active game configuration settings, parsed from a {@link Phaser.Types.Core.GameConfig} object.
    */
  @JSImport("phaser", "Core.Config")
  @js.native
  /**
    * 
    * @param GameConfig The configuration object for your Phaser Game instance.
    */
  class Config ()
    extends typingsSlinky.phaser.Phaser.Core.Config {
    def this(GameConfig: typingsSlinky.phaser.Phaser.Types.Core.GameConfig) = this()
  }
  
  /**
    * Called automatically by Phaser.Game and responsible for creating the renderer it will use.
    * 
    * Relies upon two webpack global flags to be defined: `WEBGL_RENDERER` and `CANVAS_RENDERER` during build time, but not at run-time.
    * @param game The Phaser.Game instance on which the renderer will be set.
    */
  @JSImport("phaser", "Core.CreateRenderer")
  @js.native
  def CreateRenderer(game: typingsSlinky.phaser.Phaser.Game): Unit = js.native
  
  /**
    * Called automatically by Phaser.Game and responsible for creating the console.log debug header.
    * 
    * You can customize or disable the header via the Game Config object.
    * @param game The Phaser.Game instance which will output this debug header.
    */
  @JSImport("phaser", "Core.DebugHeader")
  @js.native
  def DebugHeader(game: typingsSlinky.phaser.Phaser.Game): Unit = js.native
  
  object Events {
    
    /**
      * The Game Blur Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the window in which the Game instance is embedded
      * enters a blurred state. The blur event is raised when the window loses focus. This can happen if a user swaps
      * tab, or if they simply remove focus from the browser to another app.
      */
    @JSImport("phaser", "Core.Events.BLUR")
    @js.native
    val BLUR: js.Any = js.native
    
    /**
      * The Game Boot Event.
      * 
      * This event is dispatched when the Phaser Game instance has finished booting, but before it is ready to start running.
      * The global systems use this event to know when to set themselves up, dispatching their own `ready` events as required.
      */
    @JSImport("phaser", "Core.Events.BOOT")
    @js.native
    val BOOT: js.Any = js.native
    
    /**
      * The Game Context Lost Event.
      * 
      * This event is dispatched by the Game if the WebGL Renderer it is using encounters a WebGL Context Lost event from the browser.
      * 
      * The partner event is `CONTEXT_RESTORED`.
      */
    @JSImport("phaser", "Core.Events.CONTEXT_LOST")
    @js.native
    val CONTEXT_LOST: js.Any = js.native
    
    /**
      * The Game Context Restored Event.
      * 
      * This event is dispatched by the Game if the WebGL Renderer it is using encounters a WebGL Context Restored event from the browser.
      * 
      * The partner event is `CONTEXT_LOST`.
      */
    @JSImport("phaser", "Core.Events.CONTEXT_RESTORED")
    @js.native
    val CONTEXT_RESTORED: js.Any = js.native
    
    /**
      * The Game Destroy Event.
      * 
      * This event is dispatched when the game instance has been told to destroy itself.
      * Lots of internal systems listen to this event in order to clear themselves out.
      * Custom plugins and game code should also do the same.
      */
    @JSImport("phaser", "Core.Events.DESTROY")
    @js.native
    val DESTROY: js.Any = js.native
    
    /**
      * The Game Focus Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the window in which the Game instance is embedded
      * enters a focused state. The focus event is raised when the window re-gains focus, having previously lost it.
      */
    @JSImport("phaser", "Core.Events.FOCUS")
    @js.native
    val FOCUS: js.Any = js.native
    
    /**
      * The Game Hidden Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the document in which the Game instance is embedded
      * enters a hidden state. Only browsers that support the Visibility API will cause this event to be emitted.
      * 
      * In most modern browsers, when the document enters a hidden state, the Request Animation Frame and setTimeout, which
      * control the main game loop, will automatically pause. There is no way to stop this from happening. It is something
      * your game should account for in its own code, should the pause be an issue (i.e. for multiplayer games)
      */
    @JSImport("phaser", "Core.Events.HIDDEN")
    @js.native
    val HIDDEN: js.Any = js.native
    
    /**
      * The Game Pause Event.
      * 
      * This event is dispatched when the Game loop enters a paused state, usually as a result of the Visibility Handler.
      */
    @JSImport("phaser", "Core.Events.PAUSE")
    @js.native
    val PAUSE: js.Any = js.native
    
    /**
      * The Game Post-Render Event.
      * 
      * This event is dispatched right at the end of the render process.
      * 
      * Every Scene will have rendered and been drawn to the canvas by the time this event is fired.
      * Use it for any last minute post-processing before the next game step begins.
      */
    @JSImport("phaser", "Core.Events.POST_RENDER")
    @js.native
    val POST_RENDER: js.Any = js.native
    
    /**
      * The Game Post-Step Event.
      * 
      * This event is dispatched after the Scene Manager has updated.
      * Hook into it from plugins or systems that need to do things before the render starts.
      */
    @JSImport("phaser", "Core.Events.POST_STEP")
    @js.native
    val POST_STEP: js.Any = js.native
    
    /**
      * The Game Pre-Render Event.
      * 
      * This event is dispatched immediately before any of the Scenes have started to render.
      * 
      * The renderer will already have been initialized this frame, clearing itself and preparing to receive the Scenes for rendering, but it won't have actually drawn anything yet.
      */
    @JSImport("phaser", "Core.Events.PRE_RENDER")
    @js.native
    val PRE_RENDER: js.Any = js.native
    
    /**
      * The Game Pre-Step Event.
      * 
      * This event is dispatched before the main Game Step starts. By this point in the game cycle none of the Scene updates have yet happened.
      * Hook into it from plugins or systems that need to update before the Scene Manager does.
      */
    @JSImport("phaser", "Core.Events.PRE_STEP")
    @js.native
    val PRE_STEP: js.Any = js.native
    
    /**
      * The Game Ready Event.
      * 
      * This event is dispatched when the Phaser Game instance has finished booting, the Texture Manager is fully ready,
      * and all local systems are now able to start.
      */
    @JSImport("phaser", "Core.Events.READY")
    @js.native
    val READY: js.Any = js.native
    
    /**
      * The Game Resume Event.
      * 
      * This event is dispatched when the game loop leaves a paused state and resumes running.
      */
    @JSImport("phaser", "Core.Events.RESUME")
    @js.native
    val RESUME: js.Any = js.native
    
    /**
      * The Game Step Event.
      * 
      * This event is dispatched after the Game Pre-Step and before the Scene Manager steps.
      * Hook into it from plugins or systems that need to update before the Scene Manager does, but after the core Systems have.
      */
    @JSImport("phaser", "Core.Events.STEP")
    @js.native
    val STEP: js.Any = js.native
    
    /**
      * The Game Visible Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the document in which the Game instance is embedded
      * enters a visible state, previously having been hidden.
      * 
      * Only browsers that support the Visibility API will cause this event to be emitted.
      */
    @JSImport("phaser", "Core.Events.VISIBLE")
    @js.native
    val VISIBLE: js.Any = js.native
  }
  
  /**
    * The core runner class that Phaser uses to handle the game loop. It can use either Request Animation Frame,
    * or SetTimeout, based on browser support and config settings, to create a continuous loop within the browser.
    * 
    * Each time the loop fires, `TimeStep.step` is called and this is then passed onto the core Game update loop,
    * it is the core heartbeat of your game. It will fire as often as Request Animation Frame is capable of handling
    * on the target device.
    * 
    * Note that there are lots of situations where a browser will stop updating your game. Such as if the player
    * switches tabs, or covers up the browser window with another application. In these cases, the 'heartbeat'
    * of your game will pause, and only resume when focus is returned to it by the player. There is no way to avoid
    * this situation, all you can do is use the visibility events the browser, and Phaser, provide to detect when
    * it has happened and then gracefully recover.
    */
  @JSImport("phaser", "Core.TimeStep")
  @js.native
  class TimeStep protected ()
    extends typingsSlinky.phaser.Phaser.Core.TimeStep {
    /**
      * 
      * @param game A reference to the Phaser.Game instance that owns this Time Step.
      */
    def this(game: typingsSlinky.phaser.Phaser.Game, config: FPSConfig) = this()
  }
  
  /**
    * The Visibility Handler is responsible for listening out for document level visibility change events.
    * This includes `visibilitychange` if the browser supports it, and blur and focus events. It then uses
    * the provided Event Emitter and fires the related events.
    * @param game The Game instance this Visibility Handler is working on.
    */
  @JSImport("phaser", "Core.VisibilityHandler")
  @js.native
  def VisibilityHandler(game: typingsSlinky.phaser.Phaser.Game): Unit = js.native
}
