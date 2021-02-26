package typingsSlinky.phaser.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.phaser.spine.Animation
import typingsSlinky.phaser.spine.AnimationState
import typingsSlinky.phaser.spine.AnimationStateAdapter2
import typingsSlinky.phaser.spine.AnimationStateData
import typingsSlinky.phaser.spine.AssetManager
import typingsSlinky.phaser.spine.AtlasAttachmentLoader
import typingsSlinky.phaser.spine.Attachment
import typingsSlinky.phaser.spine.AttachmentLoader
import typingsSlinky.phaser.spine.AttachmentTimeline
import typingsSlinky.phaser.spine.Bone
import typingsSlinky.phaser.spine.BoneData
import typingsSlinky.phaser.spine.BoundingBoxAttachment
import typingsSlinky.phaser.spine.ClippingAttachment
import typingsSlinky.phaser.spine.Color
import typingsSlinky.phaser.spine.ColorTimeline
import typingsSlinky.phaser.spine.ConstraintData
import typingsSlinky.phaser.spine.CurveTimeline
import typingsSlinky.phaser.spine.DebugUtils
import typingsSlinky.phaser.spine.DeformTimeline
import typingsSlinky.phaser.spine.DrawOrderTimeline
import typingsSlinky.phaser.spine.Event
import typingsSlinky.phaser.spine.EventData
import typingsSlinky.phaser.spine.EventQueue
import typingsSlinky.phaser.spine.EventTimeline
import typingsSlinky.phaser.spine.FakeTexture
import typingsSlinky.phaser.spine.IkConstraint
import typingsSlinky.phaser.spine.IkConstraintData
import typingsSlinky.phaser.spine.IkConstraintTimeline
import typingsSlinky.phaser.spine.IntSet
import typingsSlinky.phaser.spine.Interpolation
import typingsSlinky.phaser.spine.JitterEffect
import typingsSlinky.phaser.spine.MathUtils
import typingsSlinky.phaser.spine.MeshAttachment
import typingsSlinky.phaser.spine.PathAttachment
import typingsSlinky.phaser.spine.PathConstraint
import typingsSlinky.phaser.spine.PathConstraintData
import typingsSlinky.phaser.spine.PathConstraintMixTimeline
import typingsSlinky.phaser.spine.PathConstraintPositionTimeline
import typingsSlinky.phaser.spine.PathConstraintSpacingTimeline
import typingsSlinky.phaser.spine.PointAttachment
import typingsSlinky.phaser.spine.Pool
import typingsSlinky.phaser.spine.Pow
import typingsSlinky.phaser.spine.PowOut
import typingsSlinky.phaser.spine.RegionAttachment
import typingsSlinky.phaser.spine.RotateTimeline
import typingsSlinky.phaser.spine.ScaleTimeline
import typingsSlinky.phaser.spine.SharedAssetManager
import typingsSlinky.phaser.spine.ShearTimeline
import typingsSlinky.phaser.spine.Skeleton
import typingsSlinky.phaser.spine.SkeletonBinary
import typingsSlinky.phaser.spine.SkeletonBounds
import typingsSlinky.phaser.spine.SkeletonClipping
import typingsSlinky.phaser.spine.SkeletonData
import typingsSlinky.phaser.spine.SkeletonJson
import typingsSlinky.phaser.spine.Skin
import typingsSlinky.phaser.spine.SkinEntry
import typingsSlinky.phaser.spine.Slot
import typingsSlinky.phaser.spine.SlotData
import typingsSlinky.phaser.spine.SwirlEffect
import typingsSlinky.phaser.spine.Texture
import typingsSlinky.phaser.spine.TextureAtlas
import typingsSlinky.phaser.spine.TextureAtlasPage
import typingsSlinky.phaser.spine.TextureAtlasRegion
import typingsSlinky.phaser.spine.TextureRegion
import typingsSlinky.phaser.spine.TimeKeeper
import typingsSlinky.phaser.spine.Timeline
import typingsSlinky.phaser.spine.TrackEntry
import typingsSlinky.phaser.spine.TransformConstraint
import typingsSlinky.phaser.spine.TransformConstraintData
import typingsSlinky.phaser.spine.TransformConstraintTimeline
import typingsSlinky.phaser.spine.TranslateTimeline
import typingsSlinky.phaser.spine.Triangulator
import typingsSlinky.phaser.spine.TwoColorTimeline
import typingsSlinky.phaser.spine.Utils
import typingsSlinky.phaser.spine.Vector2
import typingsSlinky.phaser.spine.VertexAttachment
import typingsSlinky.phaser.spine.WindowedMean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofspine extends StObject {
  
  var Animation: (Instantiable3[
    /* name */ String, 
    /* timelines */ js.Array[Timeline], 
    /* duration */ Double, 
    typingsSlinky.phaser.spine.Animation
  ]) with TypeofAnimation = js.native
  
  var AnimationState: (Instantiable1[/* data */ AnimationStateData, typingsSlinky.phaser.spine.AnimationState]) with TypeofAnimationState = js.native
  
  var AnimationStateAdapter2: Instantiable0[typingsSlinky.phaser.spine.AnimationStateAdapter2] = js.native
  
  var AnimationStateData: Instantiable1[/* skeletonData */ SkeletonData, typingsSlinky.phaser.spine.AnimationStateData] = js.native
  
  var AssetManager: (Instantiable2[
    /* textureLoader */ js.Function1[/* image */ HTMLImageElement, js.Any], 
    /* pathPrefix */ js.UndefOr[String], 
    typingsSlinky.phaser.spine.AssetManager
  ]) with TypeofAssetManager = js.native
  
  var AtlasAttachmentLoader: Instantiable1[/* atlas */ TextureAtlas, typingsSlinky.phaser.spine.AtlasAttachmentLoader] = js.native
  
  var Attachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.Attachment] = js.native
  
  var AttachmentTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.AttachmentTimeline] = js.native
  
  var Bone: Instantiable3[
    /* data */ BoneData, 
    /* skeleton */ Skeleton, 
    /* parent */ typingsSlinky.phaser.spine.Bone, 
    typingsSlinky.phaser.spine.Bone
  ] = js.native
  
  var BoneData: Instantiable3[
    /* index */ Double, 
    /* name */ String, 
    /* parent */ typingsSlinky.phaser.spine.BoneData, 
    typingsSlinky.phaser.spine.BoneData
  ] = js.native
  
  var BoundingBoxAttachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.BoundingBoxAttachment] = js.native
  
  var ClippingAttachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.ClippingAttachment] = js.native
  
  var Color: (Instantiable4[
    /* r */ js.UndefOr[Double], 
    /* g */ js.UndefOr[Double], 
    /* b */ js.UndefOr[Double], 
    /* a */ js.UndefOr[Double], 
    typingsSlinky.phaser.spine.Color
  ]) with TypeofColor = js.native
  
  var ColorTimeline: (Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.ColorTimeline]) with TypeofColorTimeline = js.native
  
  var ConstraintData: Instantiable3[
    /* name */ String, 
    /* order */ Double, 
    /* skinRequired */ Boolean, 
    typingsSlinky.phaser.spine.ConstraintData
  ] = js.native
  
  var CurveTimeline: (Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.CurveTimeline]) with TypeofCurveTimeline = js.native
  
  var DebugUtils: Instantiable0[typingsSlinky.phaser.spine.DebugUtils] with TypeofDebugUtils = js.native
  
  var DeformTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.DeformTimeline] = js.native
  
  var DrawOrderTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.DrawOrderTimeline] = js.native
  
  var Event: Instantiable2[/* time */ Double, /* data */ EventData, typingsSlinky.phaser.spine.Event] = js.native
  
  var EventData: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.EventData] = js.native
  
  var EventQueue: Instantiable1[/* animState */ AnimationState, typingsSlinky.phaser.spine.EventQueue] = js.native
  
  var EventTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.EventTimeline] = js.native
  
  var FakeTexture: Instantiable0[typingsSlinky.phaser.spine.FakeTexture] = js.native
  
  var IkConstraint: Instantiable2[
    /* data */ IkConstraintData, 
    /* skeleton */ Skeleton, 
    typingsSlinky.phaser.spine.IkConstraint
  ] = js.native
  
  var IkConstraintData: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.IkConstraintData] = js.native
  
  var IkConstraintTimeline: (Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.IkConstraintTimeline]) with TypeofIkConstraintTimelin = js.native
  
  var IntSet: Instantiable0[typingsSlinky.phaser.spine.IntSet] = js.native
  
  var Interpolation: Instantiable0[typingsSlinky.phaser.spine.Interpolation] = js.native
  
  var JitterEffect: Instantiable2[/* jitterX */ Double, /* jitterY */ Double, typingsSlinky.phaser.spine.JitterEffect] = js.native
  
  var MathUtils: Instantiable0[typingsSlinky.phaser.spine.MathUtils] with TypeofMathUtils = js.native
  
  var MeshAttachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.MeshAttachment] = js.native
  
  var PathAttachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.PathAttachment] = js.native
  
  var PathConstraint: (Instantiable2[
    /* data */ PathConstraintData, 
    /* skeleton */ Skeleton, 
    typingsSlinky.phaser.spine.PathConstraint
  ]) with TypeofPathConstraint = js.native
  
  var PathConstraintData: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.PathConstraintData] = js.native
  
  var PathConstraintMixTimeline: (Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.PathConstraintMixTimeline]) with TypeofPathConstraintMixTi = js.native
  
  var PathConstraintPositionTimeline: (Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.PathConstraintPositionTimeline]) with TypeofPathConstraintPosit = js.native
  
  var PathConstraintSpacingTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.PathConstraintSpacingTimeline] = js.native
  
  var PointAttachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.PointAttachment] = js.native
  
  var Pool: Instantiable1[
    /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typingsSlinky.phaser.spine.Pool[js.Object]
  ] = js.native
  
  var Pow: Instantiable1[/* power */ Double, typingsSlinky.phaser.spine.Pow] = js.native
  
  var PowOut: Instantiable1[/* power */ Double, typingsSlinky.phaser.spine.PowOut] = js.native
  
  var RegionAttachment: (Instantiable1[/* name */ String, typingsSlinky.phaser.spine.RegionAttachment]) with TypeofRegionAttachment = js.native
  
  var RotateTimeline: (Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.RotateTimeline]) with TypeofRotateTimeline = js.native
  
  var ScaleTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.ScaleTimeline] = js.native
  
  var SharedAssetManager: Instantiable1[/* pathPrefix */ js.UndefOr[String], typingsSlinky.phaser.spine.SharedAssetManager] = js.native
  
  var ShearTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.ShearTimeline] = js.native
  
  var Skeleton: Instantiable1[/* data */ SkeletonData, typingsSlinky.phaser.spine.Skeleton] = js.native
  
  var SkeletonBinary: (Instantiable1[/* attachmentLoader */ AttachmentLoader, typingsSlinky.phaser.spine.SkeletonBinary]) with TypeofSkeletonBinary = js.native
  
  var SkeletonBounds: Instantiable0[typingsSlinky.phaser.spine.SkeletonBounds] = js.native
  
  var SkeletonClipping: Instantiable0[typingsSlinky.phaser.spine.SkeletonClipping] with TypeofSkeletonClipping = js.native
  
  var SkeletonData: Instantiable0[typingsSlinky.phaser.spine.SkeletonData] = js.native
  
  var SkeletonJson: (Instantiable1[/* attachmentLoader */ AttachmentLoader, typingsSlinky.phaser.spine.SkeletonJson]) with TypeofSkeletonJson = js.native
  
  var Skin: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.Skin] = js.native
  
  var SkinEntry: Instantiable3[
    /* slotIndex */ Double, 
    /* name */ String, 
    /* attachment */ Attachment, 
    typingsSlinky.phaser.spine.SkinEntry
  ] = js.native
  
  var Slot: Instantiable2[/* data */ SlotData, /* bone */ Bone, typingsSlinky.phaser.spine.Slot] = js.native
  
  var SlotData: Instantiable3[
    /* index */ Double, 
    /* name */ String, 
    /* boneData */ BoneData, 
    typingsSlinky.phaser.spine.SlotData
  ] = js.native
  
  var SwirlEffect: (Instantiable1[/* radius */ Double, typingsSlinky.phaser.spine.SwirlEffect]) with TypeofSwirlEffect = js.native
  
  var Texture: (Instantiable1[/* image */ HTMLImageElement, typingsSlinky.phaser.spine.Texture]) with TypeofTexture = js.native
  
  var TextureAtlas: Instantiable2[
    /* atlasText */ String, 
    /* textureLoader */ js.Function1[/* path */ String, js.Any], 
    typingsSlinky.phaser.spine.TextureAtlas
  ] = js.native
  
  var TextureAtlasPage: Instantiable0[typingsSlinky.phaser.spine.TextureAtlasPage] = js.native
  
  var TextureAtlasRegion: Instantiable0[typingsSlinky.phaser.spine.TextureAtlasRegion] = js.native
  
  var TextureRegion: Instantiable0[typingsSlinky.phaser.spine.TextureRegion] = js.native
  
  var TimeKeeper: Instantiable0[typingsSlinky.phaser.spine.TimeKeeper] = js.native
  
  var TrackEntry: Instantiable0[typingsSlinky.phaser.spine.TrackEntry] = js.native
  
  var TransformConstraint: Instantiable2[
    /* data */ TransformConstraintData, 
    /* skeleton */ Skeleton, 
    typingsSlinky.phaser.spine.TransformConstraint
  ] = js.native
  
  var TransformConstraintData: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.TransformConstraintData] = js.native
  
  var TransformConstraintTimeline: (Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.TransformConstraintTimeline]) with TypeofTransformConstraint = js.native
  
  var TranslateTimeline: (Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.TranslateTimeline]) with TypeofTranslateTimeline = js.native
  
  var Triangulator: Instantiable0[typingsSlinky.phaser.spine.Triangulator] with TypeofTriangulator = js.native
  
  var TwoColorTimeline: (Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.TwoColorTimeline]) with TypeofTwoColorTimeline = js.native
  
  var Utils: Instantiable0[typingsSlinky.phaser.spine.Utils] with TypeofUtils = js.native
  
  var Vector2: Instantiable2[
    /* x */ js.UndefOr[Double], 
    /* y */ js.UndefOr[Double], 
    typingsSlinky.phaser.spine.Vector2
  ] = js.native
  
  var VertexAttachment: (Instantiable1[/* name */ String, typingsSlinky.phaser.spine.VertexAttachment]) with TypeofVertexAttachment = js.native
  
  var WindowedMean: Instantiable1[/* windowSize */ js.UndefOr[Double], typingsSlinky.phaser.spine.WindowedMean] = js.native
  
  val canvas: Typeofcanvas = js.native
  
  val webgl: Typeofwebgl = js.native
}
object Typeofspine {
  
  @scala.inline
  def apply(
    Animation: (Instantiable3[
      /* name */ String, 
      /* timelines */ js.Array[Timeline], 
      /* duration */ Double, 
      Animation
    ]) with TypeofAnimation,
    AnimationState: (Instantiable1[/* data */ AnimationStateData, AnimationState]) with TypeofAnimationState,
    AnimationStateAdapter2: Instantiable0[AnimationStateAdapter2],
    AnimationStateData: Instantiable1[/* skeletonData */ SkeletonData, AnimationStateData],
    AssetManager: (Instantiable2[
      /* textureLoader */ js.Function1[/* image */ HTMLImageElement, js.Any], 
      /* pathPrefix */ js.UndefOr[String], 
      AssetManager
    ]) with TypeofAssetManager,
    AtlasAttachmentLoader: Instantiable1[/* atlas */ TextureAtlas, AtlasAttachmentLoader],
    Attachment: Instantiable1[/* name */ String, Attachment],
    AttachmentTimeline: Instantiable1[/* frameCount */ Double, AttachmentTimeline],
    Bone: Instantiable3[/* data */ BoneData, /* skeleton */ Skeleton, /* parent */ Bone, Bone],
    BoneData: Instantiable3[/* index */ Double, /* name */ String, /* parent */ BoneData, BoneData],
    BoundingBoxAttachment: Instantiable1[/* name */ String, BoundingBoxAttachment],
    ClippingAttachment: Instantiable1[/* name */ String, ClippingAttachment],
    Color: (Instantiable4[
      /* r */ js.UndefOr[Double], 
      /* g */ js.UndefOr[Double], 
      /* b */ js.UndefOr[Double], 
      /* a */ js.UndefOr[Double], 
      Color
    ]) with TypeofColor,
    ColorTimeline: (Instantiable1[/* frameCount */ Double, ColorTimeline]) with TypeofColorTimeline,
    ConstraintData: Instantiable3[/* name */ String, /* order */ Double, /* skinRequired */ Boolean, ConstraintData],
    CurveTimeline: (Instantiable1[/* frameCount */ Double, CurveTimeline]) with TypeofCurveTimeline,
    DebugUtils: Instantiable0[DebugUtils] with TypeofDebugUtils,
    DeformTimeline: Instantiable1[/* frameCount */ Double, DeformTimeline],
    DrawOrderTimeline: Instantiable1[/* frameCount */ Double, DrawOrderTimeline],
    Event: Instantiable2[/* time */ Double, /* data */ EventData, Event],
    EventData: Instantiable1[/* name */ String, EventData],
    EventQueue: Instantiable1[/* animState */ AnimationState, EventQueue],
    EventTimeline: Instantiable1[/* frameCount */ Double, EventTimeline],
    FakeTexture: Instantiable0[FakeTexture],
    IkConstraint: Instantiable2[/* data */ IkConstraintData, /* skeleton */ Skeleton, IkConstraint],
    IkConstraintData: Instantiable1[/* name */ String, IkConstraintData],
    IkConstraintTimeline: (Instantiable1[/* frameCount */ Double, IkConstraintTimeline]) with TypeofIkConstraintTimelin,
    IntSet: Instantiable0[IntSet],
    Interpolation: Instantiable0[Interpolation],
    JitterEffect: Instantiable2[/* jitterX */ Double, /* jitterY */ Double, JitterEffect],
    MathUtils: Instantiable0[MathUtils] with TypeofMathUtils,
    MeshAttachment: Instantiable1[/* name */ String, MeshAttachment],
    PathAttachment: Instantiable1[/* name */ String, PathAttachment],
    PathConstraint: (Instantiable2[/* data */ PathConstraintData, /* skeleton */ Skeleton, PathConstraint]) with TypeofPathConstraint,
    PathConstraintData: Instantiable1[/* name */ String, PathConstraintData],
    PathConstraintMixTimeline: (Instantiable1[/* frameCount */ Double, PathConstraintMixTimeline]) with TypeofPathConstraintMixTi,
    PathConstraintPositionTimeline: (Instantiable1[/* frameCount */ Double, PathConstraintPositionTimeline]) with TypeofPathConstraintPosit,
    PathConstraintSpacingTimeline: Instantiable1[/* frameCount */ Double, PathConstraintSpacingTimeline],
    PointAttachment: Instantiable1[/* name */ String, PointAttachment],
    Pool: Instantiable1[
      /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
      Pool[js.Object]
    ],
    Pow: Instantiable1[/* power */ Double, Pow],
    PowOut: Instantiable1[/* power */ Double, PowOut],
    RegionAttachment: (Instantiable1[/* name */ String, RegionAttachment]) with TypeofRegionAttachment,
    RotateTimeline: (Instantiable1[/* frameCount */ Double, RotateTimeline]) with TypeofRotateTimeline,
    ScaleTimeline: Instantiable1[/* frameCount */ Double, ScaleTimeline],
    SharedAssetManager: Instantiable1[/* pathPrefix */ js.UndefOr[String], SharedAssetManager],
    ShearTimeline: Instantiable1[/* frameCount */ Double, ShearTimeline],
    Skeleton: Instantiable1[/* data */ SkeletonData, Skeleton],
    SkeletonBinary: (Instantiable1[/* attachmentLoader */ AttachmentLoader, SkeletonBinary]) with TypeofSkeletonBinary,
    SkeletonBounds: Instantiable0[SkeletonBounds],
    SkeletonClipping: Instantiable0[SkeletonClipping] with TypeofSkeletonClipping,
    SkeletonData: Instantiable0[SkeletonData],
    SkeletonJson: (Instantiable1[/* attachmentLoader */ AttachmentLoader, SkeletonJson]) with TypeofSkeletonJson,
    Skin: Instantiable1[/* name */ String, Skin],
    SkinEntry: Instantiable3[/* slotIndex */ Double, /* name */ String, /* attachment */ Attachment, SkinEntry],
    Slot: Instantiable2[/* data */ SlotData, /* bone */ Bone, Slot],
    SlotData: Instantiable3[/* index */ Double, /* name */ String, /* boneData */ BoneData, SlotData],
    SwirlEffect: (Instantiable1[/* radius */ Double, SwirlEffect]) with TypeofSwirlEffect,
    Texture: (Instantiable1[/* image */ HTMLImageElement, Texture]) with TypeofTexture,
    TextureAtlas: Instantiable2[
      /* atlasText */ String, 
      /* textureLoader */ js.Function1[/* path */ String, js.Any], 
      TextureAtlas
    ],
    TextureAtlasPage: Instantiable0[TextureAtlasPage],
    TextureAtlasRegion: Instantiable0[TextureAtlasRegion],
    TextureRegion: Instantiable0[TextureRegion],
    TimeKeeper: Instantiable0[TimeKeeper],
    TrackEntry: Instantiable0[TrackEntry],
    TransformConstraint: Instantiable2[/* data */ TransformConstraintData, /* skeleton */ Skeleton, TransformConstraint],
    TransformConstraintData: Instantiable1[/* name */ String, TransformConstraintData],
    TransformConstraintTimeline: (Instantiable1[/* frameCount */ Double, TransformConstraintTimeline]) with TypeofTransformConstraint,
    TranslateTimeline: (Instantiable1[/* frameCount */ Double, TranslateTimeline]) with TypeofTranslateTimeline,
    Triangulator: Instantiable0[Triangulator] with TypeofTriangulator,
    TwoColorTimeline: (Instantiable1[/* frameCount */ Double, TwoColorTimeline]) with TypeofTwoColorTimeline,
    Utils: Instantiable0[Utils] with TypeofUtils,
    Vector2: Instantiable2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Vector2],
    VertexAttachment: (Instantiable1[/* name */ String, VertexAttachment]) with TypeofVertexAttachment,
    WindowedMean: Instantiable1[/* windowSize */ js.UndefOr[Double], WindowedMean],
    canvas: Typeofcanvas,
    webgl: Typeofwebgl
  ): Typeofspine = {
    val __obj = js.Dynamic.literal(Animation = Animation.asInstanceOf[js.Any], AnimationState = AnimationState.asInstanceOf[js.Any], AnimationStateAdapter2 = AnimationStateAdapter2.asInstanceOf[js.Any], AnimationStateData = AnimationStateData.asInstanceOf[js.Any], AssetManager = AssetManager.asInstanceOf[js.Any], AtlasAttachmentLoader = AtlasAttachmentLoader.asInstanceOf[js.Any], Attachment = Attachment.asInstanceOf[js.Any], AttachmentTimeline = AttachmentTimeline.asInstanceOf[js.Any], Bone = Bone.asInstanceOf[js.Any], BoneData = BoneData.asInstanceOf[js.Any], BoundingBoxAttachment = BoundingBoxAttachment.asInstanceOf[js.Any], ClippingAttachment = ClippingAttachment.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorTimeline = ColorTimeline.asInstanceOf[js.Any], ConstraintData = ConstraintData.asInstanceOf[js.Any], CurveTimeline = CurveTimeline.asInstanceOf[js.Any], DebugUtils = DebugUtils.asInstanceOf[js.Any], DeformTimeline = DeformTimeline.asInstanceOf[js.Any], DrawOrderTimeline = DrawOrderTimeline.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], EventData = EventData.asInstanceOf[js.Any], EventQueue = EventQueue.asInstanceOf[js.Any], EventTimeline = EventTimeline.asInstanceOf[js.Any], FakeTexture = FakeTexture.asInstanceOf[js.Any], IkConstraint = IkConstraint.asInstanceOf[js.Any], IkConstraintData = IkConstraintData.asInstanceOf[js.Any], IkConstraintTimeline = IkConstraintTimeline.asInstanceOf[js.Any], IntSet = IntSet.asInstanceOf[js.Any], Interpolation = Interpolation.asInstanceOf[js.Any], JitterEffect = JitterEffect.asInstanceOf[js.Any], MathUtils = MathUtils.asInstanceOf[js.Any], MeshAttachment = MeshAttachment.asInstanceOf[js.Any], PathAttachment = PathAttachment.asInstanceOf[js.Any], PathConstraint = PathConstraint.asInstanceOf[js.Any], PathConstraintData = PathConstraintData.asInstanceOf[js.Any], PathConstraintMixTimeline = PathConstraintMixTimeline.asInstanceOf[js.Any], PathConstraintPositionTimeline = PathConstraintPositionTimeline.asInstanceOf[js.Any], PathConstraintSpacingTimeline = PathConstraintSpacingTimeline.asInstanceOf[js.Any], PointAttachment = PointAttachment.asInstanceOf[js.Any], Pool = Pool.asInstanceOf[js.Any], Pow = Pow.asInstanceOf[js.Any], PowOut = PowOut.asInstanceOf[js.Any], RegionAttachment = RegionAttachment.asInstanceOf[js.Any], RotateTimeline = RotateTimeline.asInstanceOf[js.Any], ScaleTimeline = ScaleTimeline.asInstanceOf[js.Any], SharedAssetManager = SharedAssetManager.asInstanceOf[js.Any], ShearTimeline = ShearTimeline.asInstanceOf[js.Any], Skeleton = Skeleton.asInstanceOf[js.Any], SkeletonBinary = SkeletonBinary.asInstanceOf[js.Any], SkeletonBounds = SkeletonBounds.asInstanceOf[js.Any], SkeletonClipping = SkeletonClipping.asInstanceOf[js.Any], SkeletonData = SkeletonData.asInstanceOf[js.Any], SkeletonJson = SkeletonJson.asInstanceOf[js.Any], Skin = Skin.asInstanceOf[js.Any], SkinEntry = SkinEntry.asInstanceOf[js.Any], Slot = Slot.asInstanceOf[js.Any], SlotData = SlotData.asInstanceOf[js.Any], SwirlEffect = SwirlEffect.asInstanceOf[js.Any], Texture = Texture.asInstanceOf[js.Any], TextureAtlas = TextureAtlas.asInstanceOf[js.Any], TextureAtlasPage = TextureAtlasPage.asInstanceOf[js.Any], TextureAtlasRegion = TextureAtlasRegion.asInstanceOf[js.Any], TextureRegion = TextureRegion.asInstanceOf[js.Any], TimeKeeper = TimeKeeper.asInstanceOf[js.Any], TrackEntry = TrackEntry.asInstanceOf[js.Any], TransformConstraint = TransformConstraint.asInstanceOf[js.Any], TransformConstraintData = TransformConstraintData.asInstanceOf[js.Any], TransformConstraintTimeline = TransformConstraintTimeline.asInstanceOf[js.Any], TranslateTimeline = TranslateTimeline.asInstanceOf[js.Any], Triangulator = Triangulator.asInstanceOf[js.Any], TwoColorTimeline = TwoColorTimeline.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], Vector2 = Vector2.asInstanceOf[js.Any], VertexAttachment = VertexAttachment.asInstanceOf[js.Any], WindowedMean = WindowedMean.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], webgl = webgl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofspine]
  }
  
  @scala.inline
  implicit class TypeofspineMutableBuilder[Self <: Typeofspine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(
      value: (Instantiable3[
          /* name */ String, 
          /* timelines */ js.Array[Timeline], 
          /* duration */ Double, 
          Animation
        ]) with TypeofAnimation
    ): Self = StObject.set(x, "Animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationState(value: (Instantiable1[/* data */ AnimationStateData, AnimationState]) with TypeofAnimationState): Self = StObject.set(x, "AnimationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationStateAdapter2(value: Instantiable0[AnimationStateAdapter2]): Self = StObject.set(x, "AnimationStateAdapter2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationStateData(value: Instantiable1[/* skeletonData */ SkeletonData, AnimationStateData]): Self = StObject.set(x, "AnimationStateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetManager(
      value: (Instantiable2[
          /* textureLoader */ js.Function1[/* image */ HTMLImageElement, js.Any], 
          /* pathPrefix */ js.UndefOr[String], 
          AssetManager
        ]) with TypeofAssetManager
    ): Self = StObject.set(x, "AssetManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtlasAttachmentLoader(value: Instantiable1[/* atlas */ TextureAtlas, AtlasAttachmentLoader]): Self = StObject.set(x, "AtlasAttachmentLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachment(value: Instantiable1[/* name */ String, Attachment]): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentTimeline(value: Instantiable1[/* frameCount */ Double, AttachmentTimeline]): Self = StObject.set(x, "AttachmentTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBone(value: Instantiable3[/* data */ BoneData, /* skeleton */ Skeleton, /* parent */ Bone, Bone]): Self = StObject.set(x, "Bone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoneData(value: Instantiable3[/* index */ Double, /* name */ String, /* parent */ BoneData, BoneData]): Self = StObject.set(x, "BoneData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxAttachment(value: Instantiable1[/* name */ String, BoundingBoxAttachment]): Self = StObject.set(x, "BoundingBoxAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvas(value: Typeofcanvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippingAttachment(value: Instantiable1[/* name */ String, ClippingAttachment]): Self = StObject.set(x, "ClippingAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(
      value: (Instantiable4[
          /* r */ js.UndefOr[Double], 
          /* g */ js.UndefOr[Double], 
          /* b */ js.UndefOr[Double], 
          /* a */ js.UndefOr[Double], 
          Color
        ]) with TypeofColor
    ): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTimeline(value: (Instantiable1[/* frameCount */ Double, ColorTimeline]) with TypeofColorTimeline): Self = StObject.set(x, "ColorTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintData(
      value: Instantiable3[/* name */ String, /* order */ Double, /* skinRequired */ Boolean, ConstraintData]
    ): Self = StObject.set(x, "ConstraintData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveTimeline(value: (Instantiable1[/* frameCount */ Double, CurveTimeline]) with TypeofCurveTimeline): Self = StObject.set(x, "CurveTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUtils(value: Instantiable0[DebugUtils] with TypeofDebugUtils): Self = StObject.set(x, "DebugUtils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeformTimeline(value: Instantiable1[/* frameCount */ Double, DeformTimeline]): Self = StObject.set(x, "DeformTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawOrderTimeline(value: Instantiable1[/* frameCount */ Double, DrawOrderTimeline]): Self = StObject.set(x, "DrawOrderTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: Instantiable2[/* time */ Double, /* data */ EventData, Event]): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventData(value: Instantiable1[/* name */ String, EventData]): Self = StObject.set(x, "EventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventQueue(value: Instantiable1[/* animState */ AnimationState, EventQueue]): Self = StObject.set(x, "EventQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimeline(value: Instantiable1[/* frameCount */ Double, EventTimeline]): Self = StObject.set(x, "EventTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFakeTexture(value: Instantiable0[FakeTexture]): Self = StObject.set(x, "FakeTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIkConstraint(value: Instantiable2[/* data */ IkConstraintData, /* skeleton */ Skeleton, IkConstraint]): Self = StObject.set(x, "IkConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIkConstraintData(value: Instantiable1[/* name */ String, IkConstraintData]): Self = StObject.set(x, "IkConstraintData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIkConstraintTimeline(
      value: (Instantiable1[/* frameCount */ Double, IkConstraintTimeline]) with TypeofIkConstraintTimelin
    ): Self = StObject.set(x, "IkConstraintTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntSet(value: Instantiable0[IntSet]): Self = StObject.set(x, "IntSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolation(value: Instantiable0[Interpolation]): Self = StObject.set(x, "Interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitterEffect(value: Instantiable2[/* jitterX */ Double, /* jitterY */ Double, JitterEffect]): Self = StObject.set(x, "JitterEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMathUtils(value: Instantiable0[MathUtils] with TypeofMathUtils): Self = StObject.set(x, "MathUtils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshAttachment(value: Instantiable1[/* name */ String, MeshAttachment]): Self = StObject.set(x, "MeshAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathAttachment(value: Instantiable1[/* name */ String, PathAttachment]): Self = StObject.set(x, "PathAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathConstraint(
      value: (Instantiable2[/* data */ PathConstraintData, /* skeleton */ Skeleton, PathConstraint]) with TypeofPathConstraint
    ): Self = StObject.set(x, "PathConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathConstraintData(value: Instantiable1[/* name */ String, PathConstraintData]): Self = StObject.set(x, "PathConstraintData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathConstraintMixTimeline(
      value: (Instantiable1[/* frameCount */ Double, PathConstraintMixTimeline]) with TypeofPathConstraintMixTi
    ): Self = StObject.set(x, "PathConstraintMixTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathConstraintPositionTimeline(
      value: (Instantiable1[/* frameCount */ Double, PathConstraintPositionTimeline]) with TypeofPathConstraintPosit
    ): Self = StObject.set(x, "PathConstraintPositionTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathConstraintSpacingTimeline(value: Instantiable1[/* frameCount */ Double, PathConstraintSpacingTimeline]): Self = StObject.set(x, "PathConstraintSpacingTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointAttachment(value: Instantiable1[/* name */ String, PointAttachment]): Self = StObject.set(x, "PointAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(
      value: Instantiable1[
          /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          Pool[js.Object]
        ]
    ): Self = StObject.set(x, "Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPow(value: Instantiable1[/* power */ Double, Pow]): Self = StObject.set(x, "Pow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowOut(value: Instantiable1[/* power */ Double, PowOut]): Self = StObject.set(x, "PowOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionAttachment(value: (Instantiable1[/* name */ String, RegionAttachment]) with TypeofRegionAttachment): Self = StObject.set(x, "RegionAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateTimeline(value: (Instantiable1[/* frameCount */ Double, RotateTimeline]) with TypeofRotateTimeline): Self = StObject.set(x, "RotateTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleTimeline(value: Instantiable1[/* frameCount */ Double, ScaleTimeline]): Self = StObject.set(x, "ScaleTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedAssetManager(value: Instantiable1[/* pathPrefix */ js.UndefOr[String], SharedAssetManager]): Self = StObject.set(x, "SharedAssetManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShearTimeline(value: Instantiable1[/* frameCount */ Double, ShearTimeline]): Self = StObject.set(x, "ShearTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeleton(value: Instantiable1[/* data */ SkeletonData, Skeleton]): Self = StObject.set(x, "Skeleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonBinary(
      value: (Instantiable1[/* attachmentLoader */ AttachmentLoader, SkeletonBinary]) with TypeofSkeletonBinary
    ): Self = StObject.set(x, "SkeletonBinary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonBounds(value: Instantiable0[SkeletonBounds]): Self = StObject.set(x, "SkeletonBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonClipping(value: Instantiable0[SkeletonClipping] with TypeofSkeletonClipping): Self = StObject.set(x, "SkeletonClipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonData(value: Instantiable0[SkeletonData]): Self = StObject.set(x, "SkeletonData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonJson(
      value: (Instantiable1[/* attachmentLoader */ AttachmentLoader, SkeletonJson]) with TypeofSkeletonJson
    ): Self = StObject.set(x, "SkeletonJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkin(value: Instantiable1[/* name */ String, Skin]): Self = StObject.set(x, "Skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkinEntry(
      value: Instantiable3[/* slotIndex */ Double, /* name */ String, /* attachment */ Attachment, SkinEntry]
    ): Self = StObject.set(x, "SkinEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlot(value: Instantiable2[/* data */ SlotData, /* bone */ Bone, Slot]): Self = StObject.set(x, "Slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotData(value: Instantiable3[/* index */ Double, /* name */ String, /* boneData */ BoneData, SlotData]): Self = StObject.set(x, "SlotData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwirlEffect(value: (Instantiable1[/* radius */ Double, SwirlEffect]) with TypeofSwirlEffect): Self = StObject.set(x, "SwirlEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTexture(value: (Instantiable1[/* image */ HTMLImageElement, Texture]) with TypeofTexture): Self = StObject.set(x, "Texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureAtlas(
      value: Instantiable2[
          /* atlasText */ String, 
          /* textureLoader */ js.Function1[/* path */ String, js.Any], 
          TextureAtlas
        ]
    ): Self = StObject.set(x, "TextureAtlas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureAtlasPage(value: Instantiable0[TextureAtlasPage]): Self = StObject.set(x, "TextureAtlasPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureAtlasRegion(value: Instantiable0[TextureAtlasRegion]): Self = StObject.set(x, "TextureAtlasRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureRegion(value: Instantiable0[TextureRegion]): Self = StObject.set(x, "TextureRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeKeeper(value: Instantiable0[TimeKeeper]): Self = StObject.set(x, "TimeKeeper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackEntry(value: Instantiable0[TrackEntry]): Self = StObject.set(x, "TrackEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformConstraint(
      value: Instantiable2[/* data */ TransformConstraintData, /* skeleton */ Skeleton, TransformConstraint]
    ): Self = StObject.set(x, "TransformConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformConstraintData(value: Instantiable1[/* name */ String, TransformConstraintData]): Self = StObject.set(x, "TransformConstraintData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformConstraintTimeline(
      value: (Instantiable1[/* frameCount */ Double, TransformConstraintTimeline]) with TypeofTransformConstraint
    ): Self = StObject.set(x, "TransformConstraintTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateTimeline(value: (Instantiable1[/* frameCount */ Double, TranslateTimeline]) with TypeofTranslateTimeline): Self = StObject.set(x, "TranslateTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangulator(value: Instantiable0[Triangulator] with TypeofTriangulator): Self = StObject.set(x, "Triangulator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoColorTimeline(value: (Instantiable1[/* frameCount */ Double, TwoColorTimeline]) with TypeofTwoColorTimeline): Self = StObject.set(x, "TwoColorTimeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtils(value: Instantiable0[Utils] with TypeofUtils): Self = StObject.set(x, "Utils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVector2(value: Instantiable2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Vector2]): Self = StObject.set(x, "Vector2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexAttachment(value: (Instantiable1[/* name */ String, VertexAttachment]) with TypeofVertexAttachment): Self = StObject.set(x, "VertexAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebgl(value: Typeofwebgl): Self = StObject.set(x, "webgl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowedMean(value: Instantiable1[/* windowSize */ js.UndefOr[Double], WindowedMean]): Self = StObject.set(x, "WindowedMean", value.asInstanceOf[js.Any])
  }
}
