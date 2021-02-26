package typingsSlinky.p2

import typingsSlinky.p2.mod.ContactEquation
import typingsSlinky.p2.mod.FrictionEquation
import typingsSlinky.p2.mod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Body extends StObject {
    
    var body: typingsSlinky.p2.mod.Body = js.native
    
    var `type`: String = js.native
  }
  object Body {
    
    @scala.inline
    def apply(body: typingsSlinky.p2.mod.Body, `type`: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: typingsSlinky.p2.mod.Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BodyA extends StObject {
    
    var bodyA: typingsSlinky.p2.mod.Body = js.native
    
    var bodyB: typingsSlinky.p2.mod.Body = js.native
    
    var contactEquation: ContactEquation = js.native
    
    var shapeA: Shape = js.native
    
    var shapeB: Shape = js.native
    
    var `type`: String = js.native
  }
  object BodyA {
    
    @scala.inline
    def apply(
      bodyA: typingsSlinky.p2.mod.Body,
      bodyB: typingsSlinky.p2.mod.Body,
      contactEquation: ContactEquation,
      shapeA: Shape,
      shapeB: Shape,
      `type`: String
    ): BodyA = {
      val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], contactEquation = contactEquation.asInstanceOf[js.Any], shapeA = shapeA.asInstanceOf[js.Any], shapeB = shapeB.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyA]
    }
    
    @scala.inline
    implicit class BodyAMutableBuilder[Self <: BodyA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyA(value: typingsSlinky.p2.mod.Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyB(value: typingsSlinky.p2.mod.Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContactEquation(value: ContactEquation): Self = StObject.set(x, "contactEquation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeA(value: Shape): Self = StObject.set(x, "shapeA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeB(value: Shape): Self = StObject.set(x, "shapeB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BodyB extends StObject {
    
    var bodyA: typingsSlinky.p2.mod.Body = js.native
    
    var bodyB: typingsSlinky.p2.mod.Body = js.native
    
    var contactEquations: js.Array[ContactEquation] = js.native
    
    var shapeA: Shape = js.native
    
    var shapeB: Shape = js.native
    
    var `type`: String = js.native
  }
  object BodyB {
    
    @scala.inline
    def apply(
      bodyA: typingsSlinky.p2.mod.Body,
      bodyB: typingsSlinky.p2.mod.Body,
      contactEquations: js.Array[ContactEquation],
      shapeA: Shape,
      shapeB: Shape,
      `type`: String
    ): BodyB = {
      val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], contactEquations = contactEquations.asInstanceOf[js.Any], shapeA = shapeA.asInstanceOf[js.Any], shapeB = shapeB.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyB]
    }
    
    @scala.inline
    implicit class BodyBMutableBuilder[Self <: BodyB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyA(value: typingsSlinky.p2.mod.Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyB(value: typingsSlinky.p2.mod.Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContactEquations(value: js.Array[ContactEquation]): Self = StObject.set(x, "contactEquations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContactEquationsVarargs(value: ContactEquation*): Self = StObject.set(x, "contactEquations", js.Array(value :_*))
      
      @scala.inline
      def setShapeA(value: Shape): Self = StObject.set(x, "shapeA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeB(value: Shape): Self = StObject.set(x, "shapeB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContactEquations extends StObject {
    
    var contactEquations: js.Array[ContactEquation] = js.native
    
    var frictionEquations: js.Array[FrictionEquation] = js.native
    
    var `type`: String = js.native
  }
  object ContactEquations {
    
    @scala.inline
    def apply(
      contactEquations: js.Array[ContactEquation],
      frictionEquations: js.Array[FrictionEquation],
      `type`: String
    ): ContactEquations = {
      val __obj = js.Dynamic.literal(contactEquations = contactEquations.asInstanceOf[js.Any], frictionEquations = frictionEquations.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContactEquations]
    }
    
    @scala.inline
    implicit class ContactEquationsMutableBuilder[Self <: ContactEquations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContactEquations(value: js.Array[ContactEquation]): Self = StObject.set(x, "contactEquations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContactEquationsVarargs(value: ContactEquation*): Self = StObject.set(x, "contactEquations", js.Array(value :_*))
      
      @scala.inline
      def setFrictionEquations(value: js.Array[FrictionEquation]): Self = StObject.set(x, "frictionEquations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrictionEquationsVarargs(value: FrictionEquation*): Self = StObject.set(x, "frictionEquations", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptimalDecomp extends StObject {
    
    var optimalDecomp: js.UndefOr[Boolean] = js.native
    
    var removeCollinearPoints: js.UndefOr[Boolean | Double] = js.native
    
    var skipSimpleCheck: js.UndefOr[Boolean] = js.native
  }
  object OptimalDecomp {
    
    @scala.inline
    def apply(): OptimalDecomp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptimalDecomp]
    }
    
    @scala.inline
    implicit class OptimalDecompMutableBuilder[Self <: OptimalDecomp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptimalDecomp(value: Boolean): Self = StObject.set(x, "optimalDecomp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimalDecompUndefined: Self = StObject.set(x, "optimalDecomp", js.undefined)
      
      @scala.inline
      def setRemoveCollinearPoints(value: Boolean | Double): Self = StObject.set(x, "removeCollinearPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveCollinearPointsUndefined: Self = StObject.set(x, "removeCollinearPoints", js.undefined)
      
      @scala.inline
      def setSkipSimpleCheck(value: Boolean): Self = StObject.set(x, "skipSimpleCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipSimpleCheckUndefined: Self = StObject.set(x, "skipSimpleCheck", js.undefined)
    }
  }
  
  @js.native
  trait Pairs extends StObject {
    
    var pairs: js.Array[typingsSlinky.p2.mod.Body] = js.native
    
    var `type`: String = js.native
  }
  object Pairs {
    
    @scala.inline
    def apply(pairs: js.Array[typingsSlinky.p2.mod.Body], `type`: String): Pairs = {
      val __obj = js.Dynamic.literal(pairs = pairs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pairs]
    }
    
    @scala.inline
    implicit class PairsMutableBuilder[Self <: Pairs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPairs(value: js.Array[typingsSlinky.p2.mod.Body]): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPairsVarargs(value: typingsSlinky.p2.mod.Body*): Self = StObject.set(x, "pairs", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Relaxation extends StObject {
    
    var relaxation: js.UndefOr[Double] = js.native
    
    var stiffness: js.UndefOr[Double] = js.native
  }
  object Relaxation {
    
    @scala.inline
    def apply(): Relaxation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Relaxation]
    }
    
    @scala.inline
    implicit class RelaxationMutableBuilder[Self <: Relaxation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRelaxation(value: Double): Self = StObject.set(x, "relaxation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelaxationUndefined: Self = StObject.set(x, "relaxation", js.undefined)
      
      @scala.inline
      def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    }
  }
  
  @js.native
  trait ShapeA extends StObject {
    
    var bodyA: typingsSlinky.p2.mod.Body = js.native
    
    var bodyB: typingsSlinky.p2.mod.Body = js.native
    
    var shapeA: Shape = js.native
    
    var shapeB: Shape = js.native
    
    var `type`: String = js.native
  }
  object ShapeA {
    
    @scala.inline
    def apply(
      bodyA: typingsSlinky.p2.mod.Body,
      bodyB: typingsSlinky.p2.mod.Body,
      shapeA: Shape,
      shapeB: Shape,
      `type`: String
    ): ShapeA = {
      val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], shapeA = shapeA.asInstanceOf[js.Any], shapeB = shapeB.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShapeA]
    }
    
    @scala.inline
    implicit class ShapeAMutableBuilder[Self <: ShapeA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyA(value: typingsSlinky.p2.mod.Body): Self = StObject.set(x, "bodyA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyB(value: typingsSlinky.p2.mod.Body): Self = StObject.set(x, "bodyB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeA(value: Shape): Self = StObject.set(x, "shapeA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeB(value: Shape): Self = StObject.set(x, "shapeB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Spring extends StObject {
    
    var spring: typingsSlinky.p2.mod.Spring = js.native
    
    var `type`: String = js.native
  }
  object Spring {
    
    @scala.inline
    def apply(spring: typingsSlinky.p2.mod.Spring, `type`: String): Spring = {
      val __obj = js.Dynamic.literal(spring = spring.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spring]
    }
    
    @scala.inline
    implicit class SpringMutableBuilder[Self <: Spring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpring(value: typingsSlinky.p2.mod.Spring): Self = StObject.set(x, "spring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: String = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: String): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
