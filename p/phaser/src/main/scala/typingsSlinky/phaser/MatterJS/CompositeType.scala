package typingsSlinky.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  --------------------------------------------------------------
//  Types
//  --------------------------------------------------------------
@js.native
trait CompositeType extends StObject {
  
  /**
    * An array of `Body` that are _direct_ children of this composite.
    * To add or remove bodies you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allBodies` method.
    *
    * @property bodies
    * @type body[]
    * @default []
    */
  var bodies: js.Array[BodyType] = js.native
  
  /**
    * An array of `Composite` that are _direct_ children of this composite.
    * To add or remove composites you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allComposites` method.
    *
    * @property composites
    * @type composite[]
    * @default []
    */
  var composites: js.Array[CompositeType] = js.native
  
  /**
    * An array of `Constraint` that are _direct_ children of this composite.
    * To add or remove constraints you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allConstraints` method.
    *
    * @property constraints
    * @type constraint[]
    * @default []
    */
  var constraints: js.Array[ConstraintType] = js.native
  
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  var id: Double = js.native
  
  /**
    * A flag that specifies whether the composite has been modified during the current step.
    * Most `Matter.Composite` methods will automatically set this flag to `true` to inform the engine of changes to be handled.
    * If you need to change it manually, you should use the `Composite.setModified` method.
    *
    * @property isModified
    * @type boolean
    * @default false
    */
  var isModified: Boolean = js.native
  
  /**
    * An arbitrary `String` name to help the user identify and manage composites.
    *
    * @property label
    * @type string
    * @default "Composite"
    */
  var label: String = js.native
  
  /**
    * The `Composite` that is the parent of this composite. It is automatically managed by the `Matter.Composite` methods.
    *
    * @property parent
    * @type composite
    * @default null
    */
  var parent: js.UndefOr[CompositeType] = js.native
  
  /**
    * An object reserved for storing plugin-specific properties.
    *
    * @property plugin
    * @type {}
    */
  var plugin: js.Any = js.native
  
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "composite"
    */
  var `type`: String = js.native
}
object CompositeType {
  
  @scala.inline
  def apply(
    bodies: js.Array[BodyType],
    composites: js.Array[CompositeType],
    constraints: js.Array[ConstraintType],
    id: Double,
    isModified: Boolean,
    label: String,
    plugin: js.Any,
    `type`: String
  ): CompositeType = {
    val __obj = js.Dynamic.literal(bodies = bodies.asInstanceOf[js.Any], composites = composites.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeType]
  }
  
  @scala.inline
  implicit class CompositeTypeMutableBuilder[Self <: CompositeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodies(value: js.Array[BodyType]): Self = StObject.set(x, "bodies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodiesVarargs(value: BodyType*): Self = StObject.set(x, "bodies", js.Array(value :_*))
    
    @scala.inline
    def setComposites(value: js.Array[CompositeType]): Self = StObject.set(x, "composites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositesVarargs(value: CompositeType*): Self = StObject.set(x, "composites", js.Array(value :_*))
    
    @scala.inline
    def setConstraints(value: js.Array[ConstraintType]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsVarargs(value: ConstraintType*): Self = StObject.set(x, "constraints", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModified(value: Boolean): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: CompositeType): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPlugin(value: js.Any): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
