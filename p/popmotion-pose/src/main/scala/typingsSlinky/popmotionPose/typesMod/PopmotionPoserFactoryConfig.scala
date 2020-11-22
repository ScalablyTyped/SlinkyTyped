package typingsSlinky.popmotionPose.typesMod

import typingsSlinky.popmotionPose.anon.ElementStyler
import typingsSlinky.poseCore.typesMod.ExtendAPI
import typingsSlinky.poseCore.typesMod.Poser
import typingsSlinky.poseCore.typesMod.PoserConfig
import typingsSlinky.poseCore.typesMod.ReadValueFromSource
import typingsSlinky.poseCore.typesMod.TransformPose
import typingsSlinky.stylefire.typesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopmotionPoserFactoryConfig[P, TD] extends js.Object {
  
  def addListenerToValue(key: String, styler: Styler): js.Function1[/* v */ js.Any, Unit] = js.native
  
  def extendAPI(
    api: Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
      P
    ],
    state: typingsSlinky.poseCore.typesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
      P
    ],
    config: PoserConfig[Value]
  ): Poser[
    Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
    P
  ] = js.native
  @JSName("extendAPI")
  var extendAPI_Original: ExtendAPI[
    Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
    P
  ] = js.native
  
  def forceRender(props: ElementStyler): Unit = js.native
  
  var posePriority: js.UndefOr[js.Array[String]] = js.native
  
  var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.native
  
  def setValueNative(key: String, to: js.Any, props: ElementStyler): Unit = js.native
  
  def transformPose(
    pose: typingsSlinky.poseCore.typesMod.Pose[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
      TD
    ],
    key: String,
    state: typingsSlinky.poseCore.typesMod.PoserState[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
      P
    ]
  ): typingsSlinky.poseCore.typesMod.Pose[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
    TD
  ] = js.native
  @JSName("transformPose")
  var transformPose_Original: TransformPose[
    Value, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
    P, 
    TD
  ] = js.native
}
