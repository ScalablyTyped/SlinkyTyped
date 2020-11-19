package typingsSlinky.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Systems are individual components to the Renderer pipeline.
  * @namespace PIXI.systems
  */
@JSImport("pixi.js", "systems")
@js.native
object systems extends js.Object {
  
  /**
    * System plugin to the renderer to manage masks of certain type
    *
    * @class
    * @extends PIXI.System
    * @memberof PIXI.systems
    */
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
  @js.native
  class TextureSystem protected ()
    extends typingsSlinky.pixiJs.PIXI.systems.TextureSystem {
    def this(renderer: typingsSlinky.pixiJs.PIXI.Renderer) = this()
  }
}
