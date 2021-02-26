package typingsSlinky.pixiSpine.PIXI.spine

import typingsSlinky.pixiSpine.PIXI.spine.core.AnimationState
import typingsSlinky.pixiSpine.PIXI.spine.core.AnimationStateData
import typingsSlinky.pixiSpine.PIXI.spine.core.ClippingAttachment
import typingsSlinky.pixiSpine.PIXI.spine.core.MeshAttachment
import typingsSlinky.pixiSpine.PIXI.spine.core.RegionAttachment
import typingsSlinky.pixiSpine.PIXI.spine.core.Skeleton
import typingsSlinky.pixiSpine.PIXI.spine.core.SkeletonData
import typingsSlinky.pixiSpine.PIXI.spine.core.Slot
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Container * / any */ @js.native
trait Spine extends StObject {
  
  var _autoUpdate: js.Any = js.native
  
  var _visible: js.Any = js.native
  
  def autoUpdate: Boolean = js.native
  
  def autoUpdateTransform(): Unit = js.native
  
  def autoUpdate_=(value: Boolean): Unit = js.native
  
  def createGraphics(slot: Slot, clip: ClippingAttachment): js.Any = js.native
  
  def createMesh(slot: Slot, attachment: MeshAttachment): SpineMesh = js.native
  
  def createSprite(slot: Slot, attachment: RegionAttachment, defName: String): SpineSprite = js.native
  
  def delayLimit: Double = js.native
  
  def destroy(): Unit = js.native
  def destroy(options: js.Any): Unit = js.native
  
  def hackAttachmentGroups(nameSuffix: String, group: js.Any, outGroup: js.Any): js.Array[js.Array[_]] = js.native
  
  def hackTextureAttachment(slotName: String, attachmentName: String, texture: js.Any): Boolean = js.native
  def hackTextureAttachment(
    slotName: String,
    attachmentName: String,
    texture: js.Any,
    size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any
  ): Boolean = js.native
  
  def hackTextureBySlotIndex(slotIndex: Double): Boolean = js.native
  def hackTextureBySlotIndex(
    slotIndex: Double,
    texture: js.UndefOr[scala.Nothing],
    size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any
  ): Boolean = js.native
  def hackTextureBySlotIndex(
    slotIndex: Double,
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): Boolean = js.native
  def hackTextureBySlotIndex(
    slotIndex: Double,
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any
  ): Boolean = js.native
  
  def hackTextureBySlotName(slotName: String): Boolean = js.native
  def hackTextureBySlotName(
    slotName: String,
    texture: js.UndefOr[scala.Nothing],
    size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any
  ): Boolean = js.native
  def hackTextureBySlotName(
    slotName: String,
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): Boolean = js.native
  def hackTextureBySlotName(
    slotName: String,
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    size: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Rectangle */ js.Any
  ): Boolean = js.native
  
  var lastTime: Double = js.native
  
  var localDelayLimit: Double = js.native
  
  def newContainer(): js.Any = js.native
  
  def newGraphics(): js.Any = js.native
  
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.UndefOr[scala.Nothing],
    uvs: js.UndefOr[scala.Nothing],
    indices: js.UndefOr[scala.Nothing],
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.UndefOr[scala.Nothing],
    uvs: js.UndefOr[scala.Nothing],
    indices: js.typedarray.Uint16Array
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.UndefOr[scala.Nothing],
    uvs: js.UndefOr[scala.Nothing],
    indices: js.typedarray.Uint16Array,
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.UndefOr[scala.Nothing],
    uvs: js.typedarray.Float32Array
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.UndefOr[scala.Nothing],
    uvs: js.typedarray.Float32Array,
    indices: js.UndefOr[scala.Nothing],
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.UndefOr[scala.Nothing],
    uvs: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.UndefOr[scala.Nothing],
    uvs: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array,
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.typedarray.Float32Array
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.typedarray.Float32Array,
    uvs: js.UndefOr[scala.Nothing],
    indices: js.UndefOr[scala.Nothing],
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.typedarray.Float32Array,
    uvs: js.UndefOr[scala.Nothing],
    indices: js.typedarray.Uint16Array
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.typedarray.Float32Array,
    uvs: js.UndefOr[scala.Nothing],
    indices: js.typedarray.Uint16Array,
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.typedarray.Float32Array,
    uvs: js.typedarray.Float32Array
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.typedarray.Float32Array,
    uvs: js.typedarray.Float32Array,
    indices: js.UndefOr[scala.Nothing],
    drawMode: Double
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.typedarray.Float32Array,
    uvs: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array
  ): SpineMesh = js.native
  def newMesh(
    texture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any,
    vertices: js.typedarray.Float32Array,
    uvs: js.typedarray.Float32Array,
    indices: js.typedarray.Uint16Array,
    drawMode: Double
  ): SpineMesh = js.native
  
  def newSprite(
    tex: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Texture */ js.Any
  ): SpineSprite = js.native
  
  var setMeshRegion: js.Any = js.native
  
  var setSpriteRegion: js.Any = js.native
  
  var skeleton: Skeleton = js.native
  
  var slotContainers: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Container */ _
  ] = js.native
  
  var spineData: SkeletonData = js.native
  
  var state: AnimationState = js.native
  
  var stateData: AnimationStateData = js.native
  
  var tempClipContainers: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.Container */ _
  ] = js.native
  
  def tint: Double = js.native
  
  var tintRgb: ArrayLike[Double] = js.native
  
  def tint_=(value: Double): Unit = js.native
  
  def transformHack(): Double = js.native
  
  def update(dt: Double): Unit = js.native
  
  def updateGraphics(slot: Slot, clip: ClippingAttachment): Unit = js.native
  
  def visible: Boolean = js.native
  def visible_=(value: Boolean): Unit = js.native
}
