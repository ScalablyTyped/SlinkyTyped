package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sceneLoaderMod {
  
  type ISceneLoaderPluginExtensions = /**
    * Defines the list of supported extensions
    */
  org.scalablytyped.runtime.StringDictionary[typingsSlinky.babylonjs.anon.IsBinary]
  
  type SceneLoaderSuccessCallback = js.Function7[
    /* meshes */ js.Array[typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh], 
    /* particleSystems */ js.Array[typingsSlinky.babylonjs.iparticlesystemMod.IParticleSystem], 
    /* skeletons */ js.Array[typingsSlinky.babylonjs.skeletonMod.Skeleton], 
    /* animationGroups */ js.Array[typingsSlinky.babylonjs.animationGroupMod.AnimationGroup], 
    /* transformNodes */ js.Array[typingsSlinky.babylonjs.transformNodeMod.TransformNode], 
    /* geometries */ js.Array[typingsSlinky.babylonjs.geometryMod.Geometry], 
    /* lights */ js.Array[typingsSlinky.babylonjs.lightMod.Light], 
    scala.Unit
  ]
}
