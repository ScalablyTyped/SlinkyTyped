package typingsSlinky.poseCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ActiveActions[A] = typingsSlinky.std.Map[java.lang.String, A]
  
  type ActivePoses = typingsSlinky.std.Map[java.lang.String, js.Array[java.lang.String]]
  
  type AddTransitionDelay[A] = js.Function2[/* delay */ scala.Double, /* transition */ A, A]
  
  type AncestorValueList[V] = js.Array[typingsSlinky.poseCore.typesMod.AncestorValue[V]]
  
  type ApplyMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.poseCore.typesMod.ApplyResolve | java.lang.String | scala.Double]
  
  type ApplyResolve = js.Function1[/* props */ typingsSlinky.poseCore.typesMod.Props, java.lang.String | scala.Double]
  
  type BooleanPropFactory = js.Function1[/* props */ typingsSlinky.poseCore.typesMod.Props, scala.Boolean]
  
  type ChildPosers[V, A, C, P] = typingsSlinky.std.Set[typingsSlinky.poseCore.typesMod.Poser[V, A, C, P]]
  
  type ConvertTransitionDefinition[V, A, TD] = js.Function3[
    /* value */ V, 
    /* transitionDef */ TD | A, 
    /* props */ typingsSlinky.poseCore.typesMod.Props, 
    A
  ]
  
  type ConvertValue[V] = js.Function3[
    /* value */ js.Any, 
    /* key */ java.lang.String, 
    /* props */ typingsSlinky.poseCore.typesMod.Props, 
    V
  ]
  
  type CreateValue[V] = js.Function4[
    /* init */ js.Any, 
    /* key */ java.lang.String, 
    /* props */ typingsSlinky.poseCore.typesMod.Props, 
    /* createValueProps */ js.UndefOr[typingsSlinky.poseCore.typesMod.CreateValueProps], 
    V
  ]
  
  type CreateValueProps = js.Any
  
  type ExtendAPI[V, A, C, P] = js.Function3[
    /* api */ typingsSlinky.poseCore.typesMod.Poser[V, A, C, P], 
    /* state */ typingsSlinky.poseCore.typesMod.PoserState[V, A, C, P], 
    /* config */ typingsSlinky.poseCore.typesMod.PoserConfig[V], 
    typingsSlinky.poseCore.typesMod.Poser[V, A, C, P]
  ]
  
  type GetInstantTransition[V, A] = js.Function2[/* value */ V, /* props */ typingsSlinky.poseCore.typesMod.Props, A]
  
  type GetTransitionProps[V] = js.Function3[
    /* value */ V, 
    /* target */ scala.Double, 
    /* props */ typingsSlinky.poseCore.typesMod.Props, 
    typingsSlinky.poseCore.typesMod.Props
  ]
  
  type NumberPropFactory = js.Function1[/* props */ typingsSlinky.poseCore.typesMod.Props, scala.Double]
  
  type OnChangeCallbacks = org.scalablytyped.runtime.StringDictionary[js.Function1[/* v */ js.Any, js.Any]]
  
  type PassiveValueMap = org.scalablytyped.runtime.StringDictionary[
    js.Tuple3[java.lang.String, js.Any, scala.Boolean | java.lang.String | scala.Unit]
  ]
  
  type PoseMap[A, TD] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.poseCore.typesMod.Pose[A, TD]]
  
  type PoserFactory[V, A, C, P] = js.Function1[
    /* config */ typingsSlinky.poseCore.typesMod.PoserConfig[V], 
    typingsSlinky.poseCore.typesMod.Poser[V, A, C, P]
  ]
  
  type Props = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ReadValue[V] = js.Function1[/* value */ V, js.Any]
  
  type ReadValueFromSource = js.Function2[
    /* key */ java.lang.String, 
    /* props */ typingsSlinky.poseCore.typesMod.Props, 
    js.Any
  ]
  
  type ResolveTarget[V] = js.Function2[/* value */ V, /* target */ js.Any, js.Any]
  
  type SelectValueToRead[V] = js.Function1[/* value */ V, js.Any]
  
  type SetValue[V] = js.Function2[/* v */ V, /* value */ js.Any, scala.Unit]
  
  type SetValueNative = js.Function3[
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    /* props */ typingsSlinky.poseCore.typesMod.Props, 
    scala.Unit
  ]
  
  type StaggerDirectionPropFactory = js.Function1[
    /* props */ typingsSlinky.poseCore.typesMod.Props, 
    typingsSlinky.poseCore.poseCoreNumbers.`1` | typingsSlinky.poseCore.poseCoreNumbers.`-1`
  ]
  
  type StartAction[V, A, C] = js.Function3[/* value */ V, /* action */ A, /* complete */ js.Function0[js.Any], C]
  
  type StopAction[C] = js.Function1[/* controls */ C, js.Any]
  
  type TransformPose[V, A, C, P, TD] = js.Function3[
    /* pose */ typingsSlinky.poseCore.typesMod.Pose[A, TD], 
    /* key */ java.lang.String, 
    /* state */ typingsSlinky.poseCore.typesMod.PoserState[V, A, C, P], 
    typingsSlinky.poseCore.typesMod.Pose[A, TD]
  ]
  
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  
  type TransitionFactory[A, TD] = js.Function1[
    /* props */ typingsSlinky.poseCore.typesMod.Props, 
    TD | A | typingsSlinky.poseCore.poseCoreBooleans.`false`
  ]
  
  type TransitionMap[A, TD] = org.scalablytyped.runtime.StringDictionary[
    TD | A | typingsSlinky.poseCore.poseCoreBooleans.`false` | (typingsSlinky.poseCore.typesMod.TransitionFactory[A, TD])
  ]
  
  type TransitionMapFactory[A, TD] = js.Function1[
    /* props */ typingsSlinky.poseCore.typesMod.Props, 
    typingsSlinky.poseCore.typesMod.TransitionMap[A, TD]
  ]
  
  type ValueMap[V] = typingsSlinky.std.Map[java.lang.String, V]
}
