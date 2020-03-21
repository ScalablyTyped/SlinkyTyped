package typingsSlinky.phaser

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.phaser.spine.AnimationState
import typingsSlinky.phaser.spine.AnimationStateAdapter2
import typingsSlinky.phaser.spine.AnimationStateData
import typingsSlinky.phaser.spine.AtlasAttachmentLoader
import typingsSlinky.phaser.spine.Attachment
import typingsSlinky.phaser.spine.AttachmentTimeline
import typingsSlinky.phaser.spine.Bone
import typingsSlinky.phaser.spine.BoneData
import typingsSlinky.phaser.spine.BoundingBoxAttachment
import typingsSlinky.phaser.spine.ClippingAttachment
import typingsSlinky.phaser.spine.ConstraintData
import typingsSlinky.phaser.spine.DeformTimeline
import typingsSlinky.phaser.spine.DrawOrderTimeline
import typingsSlinky.phaser.spine.Event
import typingsSlinky.phaser.spine.EventData
import typingsSlinky.phaser.spine.EventQueue
import typingsSlinky.phaser.spine.EventTimeline
import typingsSlinky.phaser.spine.FakeTexture
import typingsSlinky.phaser.spine.IkConstraint
import typingsSlinky.phaser.spine.IkConstraintData
import typingsSlinky.phaser.spine.IntSet
import typingsSlinky.phaser.spine.Interpolation
import typingsSlinky.phaser.spine.JitterEffect
import typingsSlinky.phaser.spine.MeshAttachment
import typingsSlinky.phaser.spine.PathAttachment
import typingsSlinky.phaser.spine.PathConstraintData
import typingsSlinky.phaser.spine.PathConstraintSpacingTimeline
import typingsSlinky.phaser.spine.PointAttachment
import typingsSlinky.phaser.spine.Pool
import typingsSlinky.phaser.spine.Pow
import typingsSlinky.phaser.spine.PowOut
import typingsSlinky.phaser.spine.ScaleTimeline
import typingsSlinky.phaser.spine.SharedAssetManager
import typingsSlinky.phaser.spine.ShearTimeline
import typingsSlinky.phaser.spine.Skeleton
import typingsSlinky.phaser.spine.SkeletonBounds
import typingsSlinky.phaser.spine.SkeletonData
import typingsSlinky.phaser.spine.Skin
import typingsSlinky.phaser.spine.SkinEntry
import typingsSlinky.phaser.spine.Slot
import typingsSlinky.phaser.spine.SlotData
import typingsSlinky.phaser.spine.TextureAtlas
import typingsSlinky.phaser.spine.TextureAtlasPage
import typingsSlinky.phaser.spine.TextureAtlasRegion
import typingsSlinky.phaser.spine.TextureRegion
import typingsSlinky.phaser.spine.TimeKeeper
import typingsSlinky.phaser.spine.TrackEntry
import typingsSlinky.phaser.spine.TransformConstraint
import typingsSlinky.phaser.spine.TransformConstraintData
import typingsSlinky.phaser.spine.Vector2
import typingsSlinky.phaser.spine.WindowedMean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofspine extends js.Object {
  var Animation: TypeofAnimation
  var AnimationState: TypeofAnimationState
  var AnimationStateAdapter2: Instantiable0[typingsSlinky.phaser.spine.AnimationStateAdapter2]
  var AnimationStateData: Instantiable1[/* skeletonData */ SkeletonData, typingsSlinky.phaser.spine.AnimationStateData]
  var AssetManager: TypeofAssetManager
  var AtlasAttachmentLoader: Instantiable1[/* atlas */ TextureAtlas, typingsSlinky.phaser.spine.AtlasAttachmentLoader]
  var Attachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.Attachment]
  var AttachmentTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.AttachmentTimeline]
  var Bone: Instantiable3[
    /* data */ BoneData, 
    /* skeleton */ Skeleton, 
    /* parent */ typingsSlinky.phaser.spine.Bone, 
    typingsSlinky.phaser.spine.Bone
  ]
  var BoneData: Instantiable3[
    /* index */ Double, 
    /* name */ String, 
    /* parent */ typingsSlinky.phaser.spine.BoneData, 
    typingsSlinky.phaser.spine.BoneData
  ]
  var BoundingBoxAttachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.BoundingBoxAttachment]
  var ClippingAttachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.ClippingAttachment]
  var Color: TypeofColor
  var ColorTimeline: TypeofColorTimeline
  var ConstraintData: Instantiable3[
    /* name */ String, 
    /* order */ Double, 
    /* skinRequired */ Boolean, 
    typingsSlinky.phaser.spine.ConstraintData
  ]
  var CurveTimeline: TypeofCurveTimeline
  var DebugUtils: TypeofDebugUtils
  var DeformTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.DeformTimeline]
  var DrawOrderTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.DrawOrderTimeline]
  var Event: Instantiable2[/* time */ Double, /* data */ EventData, typingsSlinky.phaser.spine.Event]
  var EventData: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.EventData]
  var EventQueue: Instantiable1[/* animState */ AnimationState, typingsSlinky.phaser.spine.EventQueue]
  var EventTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.EventTimeline]
  var FakeTexture: Instantiable0[typingsSlinky.phaser.spine.FakeTexture]
  var IkConstraint: Instantiable2[
    /* data */ IkConstraintData, 
    /* skeleton */ Skeleton, 
    typingsSlinky.phaser.spine.IkConstraint
  ]
  var IkConstraintData: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.IkConstraintData]
  var IkConstraintTimeline: TypeofIkConstraintTimelin
  var IntSet: Instantiable0[typingsSlinky.phaser.spine.IntSet]
  var Interpolation: Instantiable0[typingsSlinky.phaser.spine.Interpolation]
  var JitterEffect: Instantiable2[/* jitterX */ Double, /* jitterY */ Double, typingsSlinky.phaser.spine.JitterEffect]
  var MathUtils: TypeofMathUtils
  var MeshAttachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.MeshAttachment]
  var PathAttachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.PathAttachment]
  var PathConstraint: TypeofPathConstraint
  var PathConstraintData: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.PathConstraintData]
  var PathConstraintMixTimeline: TypeofPathConstraintMixTi
  var PathConstraintPositionTimeline: TypeofPathConstraintPosit
  var PathConstraintSpacingTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.PathConstraintSpacingTimeline]
  var PointAttachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.PointAttachment]
  var Pool: Instantiable1[
    /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typingsSlinky.phaser.spine.Pool[js.Object]
  ]
  var Pow: Instantiable1[/* power */ Double, typingsSlinky.phaser.spine.Pow]
  var PowOut: Instantiable1[/* power */ Double, typingsSlinky.phaser.spine.PowOut]
  var RegionAttachment: TypeofRegionAttachment
  var RotateTimeline: TypeofRotateTimeline
  var ScaleTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.ScaleTimeline]
  var SharedAssetManager: Instantiable1[js.UndefOr[/* pathPrefix */ String], typingsSlinky.phaser.spine.SharedAssetManager]
  var ShearTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.ShearTimeline]
  var Skeleton: Instantiable1[/* data */ SkeletonData, typingsSlinky.phaser.spine.Skeleton]
  var SkeletonBinary: TypeofSkeletonBinary
  var SkeletonBounds: Instantiable0[typingsSlinky.phaser.spine.SkeletonBounds]
  var SkeletonClipping: TypeofSkeletonClipping
  var SkeletonData: Instantiable0[typingsSlinky.phaser.spine.SkeletonData]
  var SkeletonJson: TypeofSkeletonJson
  var Skin: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.Skin]
  var SkinEntry: Instantiable3[
    /* slotIndex */ Double, 
    /* name */ String, 
    /* attachment */ Attachment, 
    typingsSlinky.phaser.spine.SkinEntry
  ]
  var Slot: Instantiable2[/* data */ SlotData, /* bone */ Bone, typingsSlinky.phaser.spine.Slot]
  var SlotData: Instantiable3[
    /* index */ Double, 
    /* name */ String, 
    /* boneData */ BoneData, 
    typingsSlinky.phaser.spine.SlotData
  ]
  var SwirlEffect: TypeofSwirlEffect
  var Texture: TypeofTexture
  var TextureAtlas: Instantiable2[
    /* atlasText */ String, 
    /* textureLoader */ js.Function1[/* path */ String, js.Any], 
    typingsSlinky.phaser.spine.TextureAtlas
  ]
  var TextureAtlasPage: Instantiable0[typingsSlinky.phaser.spine.TextureAtlasPage]
  var TextureAtlasRegion: Instantiable0[typingsSlinky.phaser.spine.TextureAtlasRegion]
  var TextureRegion: Instantiable0[typingsSlinky.phaser.spine.TextureRegion]
  var TimeKeeper: Instantiable0[typingsSlinky.phaser.spine.TimeKeeper]
  var TrackEntry: Instantiable0[typingsSlinky.phaser.spine.TrackEntry]
  var TransformConstraint: Instantiable2[
    /* data */ TransformConstraintData, 
    /* skeleton */ Skeleton, 
    typingsSlinky.phaser.spine.TransformConstraint
  ]
  var TransformConstraintData: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.TransformConstraintData]
  var TransformConstraintTimeline: TypeofTransformConstraint
  var TranslateTimeline: TypeofTranslateTimeline
  var Triangulator: TypeofTriangulator
  var TwoColorTimeline: TypeofTwoColorTimeline
  var Utils: TypeofUtils
  var Vector2: Instantiable2[
    js.UndefOr[/* x */ Double], 
    js.UndefOr[/* y */ Double], 
    typingsSlinky.phaser.spine.Vector2
  ]
  var VertexAttachment: TypeofVertexAttachment
  var WindowedMean: Instantiable1[js.UndefOr[/* windowSize */ Double], typingsSlinky.phaser.spine.WindowedMean]
  val canvas: Typeofcanvas
  val webgl: Typeofwebgl
}

object Typeofspine {
  @scala.inline
  def apply(
    Animation: TypeofAnimation,
    AnimationState: TypeofAnimationState,
    AnimationStateAdapter2: Instantiable0[AnimationStateAdapter2],
    AnimationStateData: Instantiable1[/* skeletonData */ SkeletonData, AnimationStateData],
    AssetManager: TypeofAssetManager,
    AtlasAttachmentLoader: Instantiable1[/* atlas */ TextureAtlas, AtlasAttachmentLoader],
    Attachment: Instantiable1[/* name */ String, Attachment],
    AttachmentTimeline: Instantiable1[/* frameCount */ Double, AttachmentTimeline],
    Bone: Instantiable3[/* data */ BoneData, /* skeleton */ Skeleton, /* parent */ Bone, Bone],
    BoneData: Instantiable3[/* index */ Double, /* name */ String, /* parent */ BoneData, BoneData],
    BoundingBoxAttachment: Instantiable1[/* name */ String, BoundingBoxAttachment],
    ClippingAttachment: Instantiable1[/* name */ String, ClippingAttachment],
    Color: TypeofColor,
    ColorTimeline: TypeofColorTimeline,
    ConstraintData: Instantiable3[/* name */ String, /* order */ Double, /* skinRequired */ Boolean, ConstraintData],
    CurveTimeline: TypeofCurveTimeline,
    DebugUtils: TypeofDebugUtils,
    DeformTimeline: Instantiable1[/* frameCount */ Double, DeformTimeline],
    DrawOrderTimeline: Instantiable1[/* frameCount */ Double, DrawOrderTimeline],
    Event: Instantiable2[/* time */ Double, /* data */ EventData, Event],
    EventData: Instantiable1[/* name */ String, EventData],
    EventQueue: Instantiable1[/* animState */ AnimationState, EventQueue],
    EventTimeline: Instantiable1[/* frameCount */ Double, EventTimeline],
    FakeTexture: Instantiable0[FakeTexture],
    IkConstraint: Instantiable2[/* data */ IkConstraintData, /* skeleton */ Skeleton, IkConstraint],
    IkConstraintData: Instantiable1[/* name */ String, IkConstraintData],
    IkConstraintTimeline: TypeofIkConstraintTimelin,
    IntSet: Instantiable0[IntSet],
    Interpolation: Instantiable0[Interpolation],
    JitterEffect: Instantiable2[/* jitterX */ Double, /* jitterY */ Double, JitterEffect],
    MathUtils: TypeofMathUtils,
    MeshAttachment: Instantiable1[/* name */ String, MeshAttachment],
    PathAttachment: Instantiable1[/* name */ String, PathAttachment],
    PathConstraint: TypeofPathConstraint,
    PathConstraintData: Instantiable1[/* name */ String, PathConstraintData],
    PathConstraintMixTimeline: TypeofPathConstraintMixTi,
    PathConstraintPositionTimeline: TypeofPathConstraintPosit,
    PathConstraintSpacingTimeline: Instantiable1[/* frameCount */ Double, PathConstraintSpacingTimeline],
    PointAttachment: Instantiable1[/* name */ String, PointAttachment],
    Pool: Instantiable1[
      /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
      Pool[js.Object]
    ],
    Pow: Instantiable1[/* power */ Double, Pow],
    PowOut: Instantiable1[/* power */ Double, PowOut],
    RegionAttachment: TypeofRegionAttachment,
    RotateTimeline: TypeofRotateTimeline,
    ScaleTimeline: Instantiable1[/* frameCount */ Double, ScaleTimeline],
    SharedAssetManager: Instantiable1[js.UndefOr[/* pathPrefix */ String], SharedAssetManager],
    ShearTimeline: Instantiable1[/* frameCount */ Double, ShearTimeline],
    Skeleton: Instantiable1[/* data */ SkeletonData, Skeleton],
    SkeletonBinary: TypeofSkeletonBinary,
    SkeletonBounds: Instantiable0[SkeletonBounds],
    SkeletonClipping: TypeofSkeletonClipping,
    SkeletonData: Instantiable0[SkeletonData],
    SkeletonJson: TypeofSkeletonJson,
    Skin: Instantiable1[/* name */ String, Skin],
    SkinEntry: Instantiable3[/* slotIndex */ Double, /* name */ String, /* attachment */ Attachment, SkinEntry],
    Slot: Instantiable2[/* data */ SlotData, /* bone */ Bone, Slot],
    SlotData: Instantiable3[/* index */ Double, /* name */ String, /* boneData */ BoneData, SlotData],
    SwirlEffect: TypeofSwirlEffect,
    Texture: TypeofTexture,
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
    TransformConstraintTimeline: TypeofTransformConstraint,
    TranslateTimeline: TypeofTranslateTimeline,
    Triangulator: TypeofTriangulator,
    TwoColorTimeline: TypeofTwoColorTimeline,
    Utils: TypeofUtils,
    Vector2: Instantiable2[js.UndefOr[/* x */ Double], js.UndefOr[/* y */ Double], Vector2],
    VertexAttachment: TypeofVertexAttachment,
    WindowedMean: Instantiable1[js.UndefOr[/* windowSize */ Double], WindowedMean],
    canvas: Typeofcanvas,
    webgl: Typeofwebgl
  ): Typeofspine = {
    val __obj = js.Dynamic.literal(Animation = Animation.asInstanceOf[js.Any], AnimationState = AnimationState.asInstanceOf[js.Any], AnimationStateAdapter2 = AnimationStateAdapter2.asInstanceOf[js.Any], AnimationStateData = AnimationStateData.asInstanceOf[js.Any], AssetManager = AssetManager.asInstanceOf[js.Any], AtlasAttachmentLoader = AtlasAttachmentLoader.asInstanceOf[js.Any], Attachment = Attachment.asInstanceOf[js.Any], AttachmentTimeline = AttachmentTimeline.asInstanceOf[js.Any], Bone = Bone.asInstanceOf[js.Any], BoneData = BoneData.asInstanceOf[js.Any], BoundingBoxAttachment = BoundingBoxAttachment.asInstanceOf[js.Any], ClippingAttachment = ClippingAttachment.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorTimeline = ColorTimeline.asInstanceOf[js.Any], ConstraintData = ConstraintData.asInstanceOf[js.Any], CurveTimeline = CurveTimeline.asInstanceOf[js.Any], DebugUtils = DebugUtils.asInstanceOf[js.Any], DeformTimeline = DeformTimeline.asInstanceOf[js.Any], DrawOrderTimeline = DrawOrderTimeline.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], EventData = EventData.asInstanceOf[js.Any], EventQueue = EventQueue.asInstanceOf[js.Any], EventTimeline = EventTimeline.asInstanceOf[js.Any], FakeTexture = FakeTexture.asInstanceOf[js.Any], IkConstraint = IkConstraint.asInstanceOf[js.Any], IkConstraintData = IkConstraintData.asInstanceOf[js.Any], IkConstraintTimeline = IkConstraintTimeline.asInstanceOf[js.Any], IntSet = IntSet.asInstanceOf[js.Any], Interpolation = Interpolation.asInstanceOf[js.Any], JitterEffect = JitterEffect.asInstanceOf[js.Any], MathUtils = MathUtils.asInstanceOf[js.Any], MeshAttachment = MeshAttachment.asInstanceOf[js.Any], PathAttachment = PathAttachment.asInstanceOf[js.Any], PathConstraint = PathConstraint.asInstanceOf[js.Any], PathConstraintData = PathConstraintData.asInstanceOf[js.Any], PathConstraintMixTimeline = PathConstraintMixTimeline.asInstanceOf[js.Any], PathConstraintPositionTimeline = PathConstraintPositionTimeline.asInstanceOf[js.Any], PathConstraintSpacingTimeline = PathConstraintSpacingTimeline.asInstanceOf[js.Any], PointAttachment = PointAttachment.asInstanceOf[js.Any], Pool = Pool.asInstanceOf[js.Any], Pow = Pow.asInstanceOf[js.Any], PowOut = PowOut.asInstanceOf[js.Any], RegionAttachment = RegionAttachment.asInstanceOf[js.Any], RotateTimeline = RotateTimeline.asInstanceOf[js.Any], ScaleTimeline = ScaleTimeline.asInstanceOf[js.Any], SharedAssetManager = SharedAssetManager.asInstanceOf[js.Any], ShearTimeline = ShearTimeline.asInstanceOf[js.Any], Skeleton = Skeleton.asInstanceOf[js.Any], SkeletonBinary = SkeletonBinary.asInstanceOf[js.Any], SkeletonBounds = SkeletonBounds.asInstanceOf[js.Any], SkeletonClipping = SkeletonClipping.asInstanceOf[js.Any], SkeletonData = SkeletonData.asInstanceOf[js.Any], SkeletonJson = SkeletonJson.asInstanceOf[js.Any], Skin = Skin.asInstanceOf[js.Any], SkinEntry = SkinEntry.asInstanceOf[js.Any], Slot = Slot.asInstanceOf[js.Any], SlotData = SlotData.asInstanceOf[js.Any], SwirlEffect = SwirlEffect.asInstanceOf[js.Any], Texture = Texture.asInstanceOf[js.Any], TextureAtlas = TextureAtlas.asInstanceOf[js.Any], TextureAtlasPage = TextureAtlasPage.asInstanceOf[js.Any], TextureAtlasRegion = TextureAtlasRegion.asInstanceOf[js.Any], TextureRegion = TextureRegion.asInstanceOf[js.Any], TimeKeeper = TimeKeeper.asInstanceOf[js.Any], TrackEntry = TrackEntry.asInstanceOf[js.Any], TransformConstraint = TransformConstraint.asInstanceOf[js.Any], TransformConstraintData = TransformConstraintData.asInstanceOf[js.Any], TransformConstraintTimeline = TransformConstraintTimeline.asInstanceOf[js.Any], TranslateTimeline = TranslateTimeline.asInstanceOf[js.Any], Triangulator = Triangulator.asInstanceOf[js.Any], TwoColorTimeline = TwoColorTimeline.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], Vector2 = Vector2.asInstanceOf[js.Any], VertexAttachment = VertexAttachment.asInstanceOf[js.Any], WindowedMean = WindowedMean.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], webgl = webgl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofspine]
  }
}

