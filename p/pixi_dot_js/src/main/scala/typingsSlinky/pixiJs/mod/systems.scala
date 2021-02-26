package typingsSlinky.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Systems are individual components to the Renderer pipeline.
  * @namespace PIXI.systems
  */
object systems {
  
  /**
    * System plugin to the renderer to manage masks of certain type
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.AbstractMaskSystem")
  @js.native
  class AbstractMaskSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.AbstractMaskSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage batching.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.BatchSystem")
  @js.native
  class BatchSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.BatchSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage the context.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.ContextSystem")
  @js.native
  class ContextSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.ContextSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage the filters.
    *
    * @class
    * @memberof PIXI.systems
    * @extends PIXI.System
    */
  @JSImport("pixi.js", "systems.FilterSystem")
  @js.native
  class FilterSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.FilterSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage framebuffers.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.FramebufferSystem")
  @js.native
  class FramebufferSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.FramebufferSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage geometry.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.GeometrySystem")
  @js.native
  class GeometrySystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.GeometrySystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage masks.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.MaskSystem")
  @js.native
  class MaskSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.MaskSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage the projection matrix.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.ProjectionSystem")
  @js.native
  class ProjectionSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.ProjectionSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage render textures.
    *
    * Should be added after FramebufferSystem
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.RenderTextureSystem")
  @js.native
  class RenderTextureSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.RenderTextureSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage scissor rects (used for masks).
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.ScissorSystem")
  @js.native
  class ScissorSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.ScissorSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage shaders.
    *
    * @class
    * @memberof PIXI.systems
    * @extends PIXI.System
    */
  @JSImport("pixi.js", "systems.ShaderSystem")
  @js.native
  class ShaderSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.ShaderSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage WebGL state machines.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.StateSystem")
  @js.native
  class StateSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.StateSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage stencils (used for masks).
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.StencilSystem")
  @js.native
  class StencilSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.StencilSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage texture garbage collection on the GPU,
    * ensuring that it does not get clogged up with textures that are no longer being used.
    *
    * @class
    * @memberof PIXI.systems
    * @extends PIXI.System
    */
  @JSImport("pixi.js", "systems.TextureGCSystem")
  @js.native
  class TextureGCSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.TextureGCSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
  
  /**
    * System plugin to the renderer to manage textures.
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
  @JSImport("pixi.js", "systems.TextureSystem")
  @js.native
  class TextureSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.TextureSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
}
