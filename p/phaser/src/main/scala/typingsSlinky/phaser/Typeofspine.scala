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

@js.native
trait Typeofspine extends js.Object {
  var Animation: TypeofAnimation = js.native
  var AnimationState: TypeofAnimationState = js.native
  var AnimationStateAdapter2: Instantiable0[typingsSlinky.phaser.spine.AnimationStateAdapter2] = js.native
  var AnimationStateData: Instantiable1[/* skeletonData */ SkeletonData, typingsSlinky.phaser.spine.AnimationStateData] = js.native
  var AssetManager: TypeofAssetManager = js.native
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
  var Color: TypeofColor = js.native
  var ColorTimeline: TypeofColorTimeline = js.native
  var ConstraintData: Instantiable3[
    /* name */ String, 
    /* order */ Double, 
    /* skinRequired */ Boolean, 
    typingsSlinky.phaser.spine.ConstraintData
  ] = js.native
  var CurveTimeline: TypeofCurveTimeline = js.native
  var DebugUtils: TypeofDebugUtils = js.native
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
  var IkConstraintTimeline: TypeofIkConstraintTimelin = js.native
  var IntSet: Instantiable0[typingsSlinky.phaser.spine.IntSet] = js.native
  var Interpolation: Instantiable0[typingsSlinky.phaser.spine.Interpolation] = js.native
  var JitterEffect: Instantiable2[/* jitterX */ Double, /* jitterY */ Double, typingsSlinky.phaser.spine.JitterEffect] = js.native
  var MathUtils: TypeofMathUtils = js.native
  var MeshAttachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.MeshAttachment] = js.native
  var PathAttachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.PathAttachment] = js.native
  var PathConstraint: TypeofPathConstraint = js.native
  var PathConstraintData: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.PathConstraintData] = js.native
  var PathConstraintMixTimeline: TypeofPathConstraintMixTi = js.native
  var PathConstraintPositionTimeline: TypeofPathConstraintPosit = js.native
  var PathConstraintSpacingTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.PathConstraintSpacingTimeline] = js.native
  var PointAttachment: Instantiable1[/* name */ String, typingsSlinky.phaser.spine.PointAttachment] = js.native
  var Pool: Instantiable1[
    /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
    typingsSlinky.phaser.spine.Pool[js.Object]
  ] = js.native
  var Pow: Instantiable1[/* power */ Double, typingsSlinky.phaser.spine.Pow] = js.native
  var PowOut: Instantiable1[/* power */ Double, typingsSlinky.phaser.spine.PowOut] = js.native
  var RegionAttachment: TypeofRegionAttachment = js.native
  var RotateTimeline: TypeofRotateTimeline = js.native
  var ScaleTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.ScaleTimeline] = js.native
  var SharedAssetManager: Instantiable1[js.UndefOr[/* pathPrefix */ String], typingsSlinky.phaser.spine.SharedAssetManager] = js.native
  var ShearTimeline: Instantiable1[/* frameCount */ Double, typingsSlinky.phaser.spine.ShearTimeline] = js.native
  var Skeleton: Instantiable1[/* data */ SkeletonData, typingsSlinky.phaser.spine.Skeleton] = js.native
  var SkeletonBinary: TypeofSkeletonBinary = js.native
  var SkeletonBounds: Instantiable0[typingsSlinky.phaser.spine.SkeletonBounds] = js.native
  var SkeletonClipping: TypeofSkeletonClipping = js.native
  var SkeletonData: Instantiable0[typingsSlinky.phaser.spine.SkeletonData] = js.native
  var SkeletonJson: TypeofSkeletonJson = js.native
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
  var SwirlEffect: TypeofSwirlEffect = js.native
  var Texture: TypeofTexture = js.native
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
  var TransformConstraintTimeline: TypeofTransformConstraint = js.native
  var TranslateTimeline: TypeofTranslateTimeline = js.native
  var Triangulator: TypeofTriangulator = js.native
  var TwoColorTimeline: TypeofTwoColorTimeline = js.native
  var Utils: TypeofUtils = js.native
  var Vector2: Instantiable2[
    js.UndefOr[/* x */ Double], 
    js.UndefOr[/* y */ Double], 
    typingsSlinky.phaser.spine.Vector2
  ] = js.native
  var VertexAttachment: TypeofVertexAttachment = js.native
  var WindowedMean: Instantiable1[js.UndefOr[/* windowSize */ Double], typingsSlinky.phaser.spine.WindowedMean] = js.native
  val canvas: Typeofcanvas = js.native
  val webgl: Typeofwebgl = js.native
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
  @scala.inline
  implicit class TypeofspineOps[Self <: Typeofspine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: TypeofAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationState(value: TypeofAnimationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnimationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationStateAdapter2(value: Instantiable0[AnimationStateAdapter2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnimationStateAdapter2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationStateData(value: Instantiable1[/* skeletonData */ SkeletonData, AnimationStateData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnimationStateData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssetManager(value: TypeofAssetManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAtlasAttachmentLoader(value: Instantiable1[/* atlas */ TextureAtlas, AtlasAttachmentLoader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AtlasAttachmentLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachment(value: Instantiable1[/* name */ String, Attachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachmentTimeline(value: Instantiable1[/* frameCount */ Double, AttachmentTimeline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachmentTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBone(value: Instantiable3[/* data */ BoneData, /* skeleton */ Skeleton, /* parent */ Bone, Bone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoneData(value: Instantiable3[/* index */ Double, /* name */ String, /* parent */ BoneData, BoneData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BoneData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoundingBoxAttachment(value: Instantiable1[/* name */ String, BoundingBoxAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BoundingBoxAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClippingAttachment(value: Instantiable1[/* name */ String, ClippingAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClippingAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: TypeofColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorTimeline(value: TypeofColorTimeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraintData(
      value: Instantiable3[/* name */ String, /* order */ Double, /* skinRequired */ Boolean, ConstraintData]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConstraintData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurveTimeline(value: TypeofCurveTimeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurveTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugUtils(value: TypeofDebugUtils): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebugUtils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeformTimeline(value: Instantiable1[/* frameCount */ Double, DeformTimeline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeformTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawOrderTimeline(value: Instantiable1[/* frameCount */ Double, DrawOrderTimeline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrawOrderTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: Instantiable2[/* time */ Double, /* data */ EventData, Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventData(value: Instantiable1[/* name */ String, EventData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventQueue(value: Instantiable1[/* animState */ AnimationState, EventQueue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventTimeline(value: Instantiable1[/* frameCount */ Double, EventTimeline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFakeTexture(value: Instantiable0[FakeTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FakeTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIkConstraint(value: Instantiable2[/* data */ IkConstraintData, /* skeleton */ Skeleton, IkConstraint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IkConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIkConstraintData(value: Instantiable1[/* name */ String, IkConstraintData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IkConstraintData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIkConstraintTimeline(value: TypeofIkConstraintTimelin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IkConstraintTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntSet(value: Instantiable0[IntSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterpolation(value: Instantiable0[Interpolation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJitterEffect(value: Instantiable2[/* jitterX */ Double, /* jitterY */ Double, JitterEffect]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JitterEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMathUtils(value: TypeofMathUtils): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MathUtils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeshAttachment(value: Instantiable1[/* name */ String, MeshAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MeshAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathAttachment(value: Instantiable1[/* name */ String, PathAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathConstraint(value: TypeofPathConstraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathConstraintData(value: Instantiable1[/* name */ String, PathConstraintData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathConstraintData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathConstraintMixTimeline(value: TypeofPathConstraintMixTi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathConstraintMixTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathConstraintPositionTimeline(value: TypeofPathConstraintPosit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathConstraintPositionTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathConstraintSpacingTimeline(value: Instantiable1[/* frameCount */ Double, PathConstraintSpacingTimeline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PathConstraintSpacingTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointAttachment(value: Instantiable1[/* name */ String, PointAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PointAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPool(
      value: Instantiable1[
          /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          Pool[js.Object]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPow(value: Instantiable1[/* power */ Double, Pow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowOut(value: Instantiable1[/* power */ Double, PowOut]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegionAttachment(value: TypeofRegionAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateTimeline(value: TypeofRotateTimeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RotateTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleTimeline(value: Instantiable1[/* frameCount */ Double, ScaleTimeline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScaleTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedAssetManager(value: Instantiable1[js.UndefOr[/* pathPrefix */ String], SharedAssetManager]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedAssetManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShearTimeline(value: Instantiable1[/* frameCount */ Double, ShearTimeline]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShearTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkeleton(value: Instantiable1[/* data */ SkeletonData, Skeleton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Skeleton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkeletonBinary(value: TypeofSkeletonBinary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkeletonBinary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkeletonBounds(value: Instantiable0[SkeletonBounds]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkeletonBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkeletonClipping(value: TypeofSkeletonClipping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkeletonClipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkeletonData(value: Instantiable0[SkeletonData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkeletonData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkeletonJson(value: TypeofSkeletonJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkeletonJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkin(value: Instantiable1[/* name */ String, Skin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Skin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkinEntry(
      value: Instantiable3[/* slotIndex */ Double, /* name */ String, /* attachment */ Attachment, SkinEntry]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SkinEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlot(value: Instantiable2[/* data */ SlotData, /* bone */ Bone, Slot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlotData(value: Instantiable3[/* index */ Double, /* name */ String, /* boneData */ BoneData, SlotData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlotData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwirlEffect(value: TypeofSwirlEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SwirlEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTexture(value: TypeofTexture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureAtlas(
      value: Instantiable2[
          /* atlasText */ String, 
          /* textureLoader */ js.Function1[/* path */ String, js.Any], 
          TextureAtlas
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextureAtlas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureAtlasPage(value: Instantiable0[TextureAtlasPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextureAtlasPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureAtlasRegion(value: Instantiable0[TextureAtlasRegion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextureAtlasRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureRegion(value: Instantiable0[TextureRegion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextureRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeKeeper(value: Instantiable0[TimeKeeper]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeKeeper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackEntry(value: Instantiable0[TrackEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrackEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformConstraint(
      value: Instantiable2[/* data */ TransformConstraintData, /* skeleton */ Skeleton, TransformConstraint]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformConstraintData(value: Instantiable1[/* name */ String, TransformConstraintData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformConstraintData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformConstraintTimeline(value: TypeofTransformConstraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransformConstraintTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslateTimeline(value: TypeofTranslateTimeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranslateTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriangulator(value: TypeofTriangulator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Triangulator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwoColorTimeline(value: TypeofTwoColorTimeline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TwoColorTimeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtils(value: TypeofUtils): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVector2(value: Instantiable2[js.UndefOr[/* x */ Double], js.UndefOr[/* y */ Double], Vector2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vector2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexAttachment(value: TypeofVertexAttachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VertexAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowedMean(value: Instantiable1[js.UndefOr[/* windowSize */ Double], WindowedMean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowedMean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvas(value: Typeofcanvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebgl(value: Typeofwebgl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webgl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

