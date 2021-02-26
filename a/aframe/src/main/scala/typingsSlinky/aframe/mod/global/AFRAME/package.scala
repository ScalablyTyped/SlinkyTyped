package typingsSlinky.aframe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object AFRAME {
  
  @scala.inline
  def AComponent: typingsSlinky.aframe.mod.Component[js.Any, typingsSlinky.aframe.mod.System[js.Any]] = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("AComponent").asInstanceOf[typingsSlinky.aframe.mod.Component[js.Any, typingsSlinky.aframe.mod.System[js.Any]]]
  
  @scala.inline
  def AEntity: typingsSlinky.aframe.mod.Entity[
    typingsSlinky.aframe.mod.ObjectMap[
      typingsSlinky.aframe.mod.Component[js.Any, typingsSlinky.aframe.mod.System[js.Any]]
    ]
  ] = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("AEntity").asInstanceOf[typingsSlinky.aframe.mod.Entity[
    typingsSlinky.aframe.mod.ObjectMap[
      typingsSlinky.aframe.mod.Component[js.Any, typingsSlinky.aframe.mod.System[js.Any]]
    ]
  ]]
  
  @scala.inline
  def ANode: typingsSlinky.aframe.mod.ANode = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("ANode").asInstanceOf[typingsSlinky.aframe.mod.ANode]
  
  @scala.inline
  def AScene: typingsSlinky.aframe.mod.Scene = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("AScene").asInstanceOf[typingsSlinky.aframe.mod.Scene]
  
  @scala.inline
  def components: typingsSlinky.aframe.mod.ObjectMap[
    typingsSlinky.aframe.mod.ComponentDescriptor[
      typingsSlinky.aframe.mod.Component[js.Any, typingsSlinky.aframe.mod.System[js.Any]]
    ]
  ] = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("components").asInstanceOf[typingsSlinky.aframe.mod.ObjectMap[
    typingsSlinky.aframe.mod.ComponentDescriptor[
      typingsSlinky.aframe.mod.Component[js.Any, typingsSlinky.aframe.mod.System[js.Any]]
    ]
  ]]
  
  @scala.inline
  def geometries: typingsSlinky.aframe.mod.ObjectMap[
    typingsSlinky.aframe.mod.GeometryDescriptor[typingsSlinky.aframe.mod.Geometry[js.Any]]
  ] = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("geometries").asInstanceOf[typingsSlinky.aframe.mod.ObjectMap[
    typingsSlinky.aframe.mod.GeometryDescriptor[typingsSlinky.aframe.mod.Geometry[js.Any]]
  ]]
  
  @scala.inline
  def registerComponent: js.Function2[
    /* name */ java.lang.String, 
    /* component */ typingsSlinky.aframe.mod.ComponentDefinition[js.Object], 
    typingsSlinky.aframe.mod.ComponentConstructor[js.Object]
  ] = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("registerComponent").asInstanceOf[js.Function2[
    /* name */ java.lang.String, 
    /* component */ typingsSlinky.aframe.mod.ComponentDefinition[js.Object], 
    typingsSlinky.aframe.mod.ComponentConstructor[js.Object]
  ]]
  
  @scala.inline
  def registerElement: js.Function2[/* name */ java.lang.String, /* element */ js.Object, scala.Unit] = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("registerElement").asInstanceOf[js.Function2[/* name */ java.lang.String, /* element */ js.Object, scala.Unit]]
  
  @scala.inline
  def registerGeometry: js.Function2[
    /* name */ java.lang.String, 
    /* geometry */ typingsSlinky.aframe.mod.GeometryDefinition[js.Object, js.Any], 
    typingsSlinky.aframe.mod.GeometryConstructor[js.Object]
  ] = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("registerGeometry").asInstanceOf[js.Function2[
    /* name */ java.lang.String, 
    /* geometry */ typingsSlinky.aframe.mod.GeometryDefinition[js.Object, js.Any], 
    typingsSlinky.aframe.mod.GeometryConstructor[js.Object]
  ]]
  
  @scala.inline
  def registerPrimitive: js.Function2[
    /* name */ java.lang.String, 
    /* primitive */ typingsSlinky.aframe.mod.PrimitiveDefinition, 
    scala.Unit
  ] = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("registerPrimitive").asInstanceOf[js.Function2[
    /* name */ java.lang.String, 
    /* primitive */ typingsSlinky.aframe.mod.PrimitiveDefinition, 
    scala.Unit
  ]]
  
  @scala.inline
  def registerShader: js.Function2[
    /* name */ java.lang.String, 
    /* shader */ typingsSlinky.aframe.mod.ShaderDefinition[typingsSlinky.aframe.mod.MinimalShaderDefinition with js.Object], 
    typingsSlinky.aframe.mod.ShaderConstructor[typingsSlinky.aframe.mod.MinimalShaderDefinition with js.Object]
  ] = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("registerShader").asInstanceOf[js.Function2[
    /* name */ java.lang.String, 
    /* shader */ typingsSlinky.aframe.mod.ShaderDefinition[typingsSlinky.aframe.mod.MinimalShaderDefinition with js.Object], 
    typingsSlinky.aframe.mod.ShaderConstructor[typingsSlinky.aframe.mod.MinimalShaderDefinition with js.Object]
  ]]
  
  @scala.inline
  def registerSystem: js.Function2[
    /* name */ java.lang.String, 
    /* definition */ typingsSlinky.aframe.mod.SystemDefinition[js.Object], 
    typingsSlinky.aframe.mod.SystemConstructor[js.Object]
  ] = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("registerSystem").asInstanceOf[js.Function2[
    /* name */ java.lang.String, 
    /* definition */ typingsSlinky.aframe.mod.SystemDefinition[js.Object], 
    typingsSlinky.aframe.mod.SystemConstructor[js.Object]
  ]]
  
  @scala.inline
  def scenes: js.Array[typingsSlinky.aframe.mod.Scene] = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("scenes").asInstanceOf[js.Array[typingsSlinky.aframe.mod.Scene]]
  
  @scala.inline
  def schema: typingsSlinky.aframe.mod.SchemaUtils = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("schema").asInstanceOf[typingsSlinky.aframe.mod.SchemaUtils]
  
  @scala.inline
  def shaders: typingsSlinky.aframe.mod.ObjectMap[typingsSlinky.aframe.mod.ShaderDescriptor[typingsSlinky.aframe.mod.Shader]] = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("shaders").asInstanceOf[typingsSlinky.aframe.mod.ObjectMap[typingsSlinky.aframe.mod.ShaderDescriptor[typingsSlinky.aframe.mod.Shader]]]
  
  @scala.inline
  def systems: typingsSlinky.aframe.mod.ObjectMap[typingsSlinky.aframe.mod.SystemConstructor[js.Object]] = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("systems").asInstanceOf[typingsSlinky.aframe.mod.ObjectMap[typingsSlinky.aframe.mod.SystemConstructor[js.Object]]]
  
  @scala.inline
  def utils: typingsSlinky.aframe.mod.Utils_ = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("utils").asInstanceOf[typingsSlinky.aframe.mod.Utils_]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.aframe.mod.global.AFRAME.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
