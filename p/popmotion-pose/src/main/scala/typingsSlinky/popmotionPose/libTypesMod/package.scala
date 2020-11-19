package typingsSlinky.popmotionPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object libTypesMod {
  
  type ActiveActions[A] = typingsSlinky.std.Map[java.lang.String, A]
  
  type ActivePoses = typingsSlinky.std.Map[java.lang.String, js.Array[java.lang.String]]
  
  type AddTransitionDelay[A] = js.Function2[/* delay */ scala.Double, /* transition */ A, A]
  
  type AncestorValueList[V] = js.Array[typingsSlinky.popmotionPose.libTypesMod.AncestorValue[V]]
  
  type ApplyMap = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.popmotionPose.libTypesMod.ApplyResolve | java.lang.String | scala.Double
  ]
  
  type ApplyResolve = js.Function1[
    /* props */ typingsSlinky.popmotionPose.libTypesMod.Props, 
    java.lang.String | scala.Double
  ]
  
  type BooleanPropFactory = js.Function1[/* props */ typingsSlinky.popmotionPose.libTypesMod.Props, scala.Boolean]
  
  type ChildPosers[V, A, C, P] = typingsSlinky.std.Set[typingsSlinky.popmotionPose.libTypesMod.Poser[V, A, C, P]]
  
  type ConvertTransitionDefinition[V, A, TD] = js.Function3[
    /* value */ V, 
    /* transitionDef */ TD | A, 
    /* props */ typingsSlinky.popmotionPose.libTypesMod.Props, 
    A
  ]
  
  type ConvertValue[V] = js.Function3[
    /* value */ js.Any, 
    /* key */ java.lang.String, 
    /* props */ typingsSlinky.popmotionPose.libTypesMod.Props, 
    V
  ]
  
  type CreateValue[V] = js.Function4[
    /* init */ js.Any, 
    /* key */ java.lang.String, 
    /* props */ typingsSlinky.popmotionPose.libTypesMod.Props, 
    /* createValueProps */ js.UndefOr[typingsSlinky.popmotionPose.libTypesMod.CreateValueProps], 
    V
  ]
  
  type CreateValueProps = js.Any
  
  type ExtendAPI[V, A, C, P] = js.Function3[
    /* api */ typingsSlinky.popmotionPose.libTypesMod.Poser[V, A, C, P], 
    /* state */ typingsSlinky.popmotionPose.libTypesMod.PoserState[V, A, C, P], 
    /* config */ typingsSlinky.popmotionPose.libTypesMod.PoserConfig[V], 
    typingsSlinky.popmotionPose.libTypesMod.Poser[V, A, C, P]
  ]
  
  type GetInstantTransition[V, A] = js.Function2[/* value */ V, /* props */ typingsSlinky.popmotionPose.libTypesMod.Props, A]
  
  type GetTransitionProps[V] = js.Function3[
    /* value */ V, 
    /* target */ scala.Double, 
    /* props */ typingsSlinky.popmotionPose.libTypesMod.Props, 
    typingsSlinky.popmotionPose.libTypesMod.Props
  ]
  
  type NumberPropFactory = js.Function1[/* props */ typingsSlinky.popmotionPose.libTypesMod.Props, scala.Double]
  
  type OnChangeCallbacks = org.scalablytyped.runtime.StringDictionary[js.Function1[/* v */ js.Any, js.Any]]
  
  type PassiveValueMap = org.scalablytyped.runtime.StringDictionary[
    js.Tuple3[java.lang.String, js.Any, scala.Boolean | java.lang.String | scala.Unit]
  ]
  
  type PoseMap[A, TD] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.popmotionPose.libTypesMod.Pose[A, TD]]
  
  type PoserFactory[V, A, C, P] = js.Function1[
    /* config */ typingsSlinky.popmotionPose.libTypesMod.PoserConfig[V], 
    typingsSlinky.popmotionPose.libTypesMod.Poser[V, A, C, P]
  ]
  
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ReadValue[V] = js.Function1[/* value */ V, js.Any]
  
  type ReadValueFromSource = js.Function2[
    /* key */ java.lang.String, 
    /* props */ typingsSlinky.popmotionPose.libTypesMod.Props, 
    js.Any
  ]
  
  type ResolveTarget[V] = js.Function2[/* value */ V, /* target */ js.Any, js.Any]
  
  type SelectValueToRead[V] = js.Function1[/* value */ V, js.Any]
  
  type SetValue[V] = js.Function2[/* v */ V, /* value */ js.Any, scala.Unit]
  
  type SetValueNative = js.Function3[
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    /* props */ typingsSlinky.popmotionPose.libTypesMod.Props, 
    scala.Unit
  ]
  
  type StaggerDirectionPropFactory = js.Function1[
    /* props */ typingsSlinky.popmotionPose.libTypesMod.Props, 
    typingsSlinky.popmotionPose.popmotionPoseNumbers.`1` | typingsSlinky.popmotionPose.popmotionPoseNumbers.`-1`
  ]
  
  type StartAction[V, A, C] = js.Function3[/* value */ V, /* action */ A, /* complete */ js.Function0[js.Any], C]
  
  type StopAction[C] = js.Function1[/* controls */ C, js.Any]
  
  type TransformPose[V, A, C, P, TD] = js.Function3[
    /* pose */ typingsSlinky.popmotionPose.libTypesMod.Pose[A, TD], 
    /* key */ java.lang.String, 
    /* state */ typingsSlinky.popmotionPose.libTypesMod.PoserState[V, A, C, P], 
    typingsSlinky.popmotionPose.libTypesMod.Pose[A, TD]
  ]
  
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  
  type TransitionFactory[A, TD] = js.Function1[
    /* props */ typingsSlinky.popmotionPose.libTypesMod.Props, 
    TD | A | typingsSlinky.popmotionPose.popmotionPoseBooleans.`false`
  ]
  
  type TransitionMap[A, TD] = org.scalablytyped.runtime.StringDictionary[
    TD | A | typingsSlinky.popmotionPose.popmotionPoseBooleans.`false` | (typingsSlinky.popmotionPose.libTypesMod.TransitionFactory[A, TD])
  ]
  
  type TransitionMapFactory[A, TD] = js.Function1[
    /* props */ typingsSlinky.popmotionPose.libTypesMod.Props, 
    typingsSlinky.popmotionPose.libTypesMod.TransitionMap[A, TD]
  ]
  
  type ValueMap[V] = typingsSlinky.std.Map[java.lang.String, V]
}
