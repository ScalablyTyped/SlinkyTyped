package typingsSlinky.box2d.Box2D.Collision

import typingsSlinky.box2d.Box2D.Common.Math.b2Transform
import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Shapes {
  
  @js.native
  trait b2CircleShape extends b2Shape {
    
    /**
      * Get the local position of this circle in its parent body.
      * @return This circle's local position.
      **/
    def GetLocalPosition(): b2Vec2 = js.native
    
    /**
      * Get the radius of the circle.
      * @return This circle's radius.
      **/
    def GetRadius(): Double = js.native
    
    /**
      * Set the circle shape values from another shape.
      * @param other The other circle shape to copy values from.
      **/
    def Set(other: b2CircleShape): Unit = js.native
    
    /**
      * Set the local position of this circle in its parent body.
      * @param position The new local position of this circle.
      **/
    def SetLocalPosition(position: b2Vec2): Unit = js.native
    
    /**
      * Set the radius of the circle.
      * @param radius The new radius of the circle.
      **/
    def SetRadius(radius: Double): Unit = js.native
  }
  object b2CircleShape {
    
    @scala.inline
    def apply(
      ComputeAABB: (b2AABB, b2Transform) => Unit,
      ComputeMass: (b2MassData, Double) => Unit,
      ComputeSubmergedArea: (b2Vec2, Double, b2Transform, b2Vec2) => Double,
      Copy: () => b2Shape,
      GetLocalPosition: () => b2Vec2,
      GetRadius: () => Double,
      GetType: () => Double,
      RayCast: (b2RayCastOutput, b2RayCastInput, b2Transform) => Boolean,
      Set: b2CircleShape => Unit,
      SetLocalPosition: b2Vec2 => Unit,
      SetRadius: Double => Unit,
      TestPoint: (b2Transform, b2Vec2) => Boolean
    ): b2CircleShape = {
      val __obj = js.Dynamic.literal(ComputeAABB = js.Any.fromFunction2(ComputeAABB), ComputeMass = js.Any.fromFunction2(ComputeMass), ComputeSubmergedArea = js.Any.fromFunction4(ComputeSubmergedArea), Copy = js.Any.fromFunction0(Copy), GetLocalPosition = js.Any.fromFunction0(GetLocalPosition), GetRadius = js.Any.fromFunction0(GetRadius), GetType = js.Any.fromFunction0(GetType), RayCast = js.Any.fromFunction3(RayCast), Set = js.Any.fromFunction1(Set), SetLocalPosition = js.Any.fromFunction1(SetLocalPosition), SetRadius = js.Any.fromFunction1(SetRadius), TestPoint = js.Any.fromFunction2(TestPoint))
      __obj.asInstanceOf[b2CircleShape]
    }
    
    @scala.inline
    implicit class b2CircleShapeMutableBuilder[Self <: b2CircleShape] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLocalPosition(value: () => b2Vec2): Self = StObject.set(x, "GetLocalPosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRadius(value: () => Double): Self = StObject.set(x, "GetRadius", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: b2CircleShape => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLocalPosition(value: b2Vec2 => Unit): Self = StObject.set(x, "SetLocalPosition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRadius(value: Double => Unit): Self = StObject.set(x, "SetRadius", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait b2EdgeChainDef extends StObject {
    
    /**
      * Whether to create an extra edge between the first and last vertices.
      **/
    var isALoop: Boolean = js.native
    
    /**
      * The number of vertices in the chain.
      **/
    var vertexCount: Double = js.native
    
    /**
      * The vertices in local coordinates.
      **/
    var vertices: b2Vec2 = js.native
  }
  object b2EdgeChainDef {
    
    @scala.inline
    def apply(isALoop: Boolean, vertexCount: Double, vertices: b2Vec2): b2EdgeChainDef = {
      val __obj = js.Dynamic.literal(isALoop = isALoop.asInstanceOf[js.Any], vertexCount = vertexCount.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2EdgeChainDef]
    }
    
    @scala.inline
    implicit class b2EdgeChainDefMutableBuilder[Self <: b2EdgeChainDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsALoop(value: Boolean): Self = StObject.set(x, "isALoop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexCount(value: Double): Self = StObject.set(x, "vertexCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertices(value: b2Vec2): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait b2EdgeShape extends b2Shape {
    
    /**
      * Determines if the first corner of this edge bends towards the solid side.
      * @return True if convex, otherwise false.
      **/
    def Corner1IsConvex(): Boolean = js.native
    
    /**
      * Determines if the second corner of this edge bends towards the solid side.
      * @return True if convex, otherwise false.
      **/
    def Corner2IsConvex(): Boolean = js.native
    
    /**
      * Get a core vertex 1 in local coordinates.  These vertices represent a smaller edge that is used for time of impact.
      * @return core vertex 1 in local coordinates.
      **/
    def GetCoreVertex1(): b2Vec2 = js.native
    
    /**
      * Get a core vertex 2 in local coordinates.  These vertices represent a smaller edge that is used for time of impact.
      * @return core vertex 2 in local coordinates.
      **/
    def GetCoreVertex2(): b2Vec2 = js.native
    
    /**
      * Returns a unit vector halfway between direction and previous direction.
      * @return Halfway unit vector between direction and previous direction.
      **/
    def GetCorner1Vector(): b2Vec2 = js.native
    
    /**
      * Returns a unit vector halfway between direction and previous direction.
      * @return Halfway unit vector between direction and previous direction.
      **/
    def GetCorner2Vector(): b2Vec2 = js.native
    
    /**
      * Get a parallel unit vector, pointing from vertex 1 to vertex 2.
      * @return Vertex 1 to vertex 2 directional vector.
      **/
    def GetDirectionVector(): b2Vec2 = js.native
    
    /**
      * Get the first vertex and apply the supplied transform.
      * @param xf Transform to apply.
      * @return First vertex with xf transform applied.
      **/
    def GetFirstVertex(xf: b2Transform): b2Vec2 = js.native
    
    /**
      * Get the distance from vertex1 to vertex2.
      * @return Distance from vertex1 to vertex2.
      **/
    def GetLength(): Double = js.native
    
    /**
      * Get the next edge in the chain.
      * @return Next edge shape or null if there is no next edge shape.
      **/
    def GetNextEdge(): b2EdgeShape = js.native
    
    /**
      * Get a perpendicular unit vector, pointing from the solid side to the empty side.
      * @return Normal vector.
      **/
    def GetNormalVector(): b2Vec2 = js.native
    
    /**
      * Get the previous edge in the chain.
      * @return Previous edge shape or null if there is no previous edge shape.
      **/
    def GetPrevEdge(): b2EdgeShape = js.native
    
    /**
      * Get the local position of vertex1 in the parent body.
      * @return Local position of vertex1 in the parent body.
      **/
    def GetVertex1(): b2Vec2 = js.native
    
    /**
      * Get the local position of vertex2 in the parent body.
      * @return Local position of vertex2 in the parent body.
      **/
    def GetVertex2(): b2Vec2 = js.native
    
    /**
      * Get the support point in the given world direction with the supplied transform.
      * @param xf Transform to apply.
      * @param dX X world direction.
      * @param dY Y world direction.
      * @return Support point.
      **/
    def Support(xf: b2Transform, dX: Double, dY: Double): b2Vec2 = js.native
  }
  object b2EdgeShape {
    
    @scala.inline
    def apply(
      ComputeAABB: (b2AABB, b2Transform) => Unit,
      ComputeMass: (b2MassData, Double) => Unit,
      ComputeSubmergedArea: (b2Vec2, Double, b2Transform, b2Vec2) => Double,
      Copy: () => b2Shape,
      Corner1IsConvex: () => Boolean,
      Corner2IsConvex: () => Boolean,
      GetCoreVertex1: () => b2Vec2,
      GetCoreVertex2: () => b2Vec2,
      GetCorner1Vector: () => b2Vec2,
      GetCorner2Vector: () => b2Vec2,
      GetDirectionVector: () => b2Vec2,
      GetFirstVertex: b2Transform => b2Vec2,
      GetLength: () => Double,
      GetNextEdge: () => b2EdgeShape,
      GetNormalVector: () => b2Vec2,
      GetPrevEdge: () => b2EdgeShape,
      GetType: () => Double,
      GetVertex1: () => b2Vec2,
      GetVertex2: () => b2Vec2,
      RayCast: (b2RayCastOutput, b2RayCastInput, b2Transform) => Boolean,
      Set: b2Shape => Unit,
      Support: (b2Transform, Double, Double) => b2Vec2,
      TestPoint: (b2Transform, b2Vec2) => Boolean
    ): b2EdgeShape = {
      val __obj = js.Dynamic.literal(ComputeAABB = js.Any.fromFunction2(ComputeAABB), ComputeMass = js.Any.fromFunction2(ComputeMass), ComputeSubmergedArea = js.Any.fromFunction4(ComputeSubmergedArea), Copy = js.Any.fromFunction0(Copy), Corner1IsConvex = js.Any.fromFunction0(Corner1IsConvex), Corner2IsConvex = js.Any.fromFunction0(Corner2IsConvex), GetCoreVertex1 = js.Any.fromFunction0(GetCoreVertex1), GetCoreVertex2 = js.Any.fromFunction0(GetCoreVertex2), GetCorner1Vector = js.Any.fromFunction0(GetCorner1Vector), GetCorner2Vector = js.Any.fromFunction0(GetCorner2Vector), GetDirectionVector = js.Any.fromFunction0(GetDirectionVector), GetFirstVertex = js.Any.fromFunction1(GetFirstVertex), GetLength = js.Any.fromFunction0(GetLength), GetNextEdge = js.Any.fromFunction0(GetNextEdge), GetNormalVector = js.Any.fromFunction0(GetNormalVector), GetPrevEdge = js.Any.fromFunction0(GetPrevEdge), GetType = js.Any.fromFunction0(GetType), GetVertex1 = js.Any.fromFunction0(GetVertex1), GetVertex2 = js.Any.fromFunction0(GetVertex2), RayCast = js.Any.fromFunction3(RayCast), Set = js.Any.fromFunction1(Set), Support = js.Any.fromFunction3(Support), TestPoint = js.Any.fromFunction2(TestPoint))
      __obj.asInstanceOf[b2EdgeShape]
    }
    
    @scala.inline
    implicit class b2EdgeShapeMutableBuilder[Self <: b2EdgeShape] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCorner1IsConvex(value: () => Boolean): Self = StObject.set(x, "Corner1IsConvex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCorner2IsConvex(value: () => Boolean): Self = StObject.set(x, "Corner2IsConvex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCoreVertex1(value: () => b2Vec2): Self = StObject.set(x, "GetCoreVertex1", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCoreVertex2(value: () => b2Vec2): Self = StObject.set(x, "GetCoreVertex2", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCorner1Vector(value: () => b2Vec2): Self = StObject.set(x, "GetCorner1Vector", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCorner2Vector(value: () => b2Vec2): Self = StObject.set(x, "GetCorner2Vector", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDirectionVector(value: () => b2Vec2): Self = StObject.set(x, "GetDirectionVector", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFirstVertex(value: b2Transform => b2Vec2): Self = StObject.set(x, "GetFirstVertex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLength(value: () => Double): Self = StObject.set(x, "GetLength", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNextEdge(value: () => b2EdgeShape): Self = StObject.set(x, "GetNextEdge", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNormalVector(value: () => b2Vec2): Self = StObject.set(x, "GetNormalVector", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPrevEdge(value: () => b2EdgeShape): Self = StObject.set(x, "GetPrevEdge", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVertex1(value: () => b2Vec2): Self = StObject.set(x, "GetVertex1", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVertex2(value: () => b2Vec2): Self = StObject.set(x, "GetVertex2", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSupport(value: (b2Transform, Double, Double) => b2Vec2): Self = StObject.set(x, "Support", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait b2MassData extends StObject {
    
    /**
      * The rotational inertia of the shape. This may be about the center or local origin, depending on usage.
      **/
    var I: Double = js.native
    
    /**
      * The position of the shape's centroid relative to the shape's origin.
      **/
    var center: b2Vec2 = js.native
    
    /**
      * The mass of the shape, usually in kilograms.
      **/
    var mass: Double = js.native
  }
  object b2MassData {
    
    @scala.inline
    def apply(I: Double, center: b2Vec2, mass: Double): b2MassData = {
      val __obj = js.Dynamic.literal(I = I.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], mass = mass.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2MassData]
    }
    
    @scala.inline
    implicit class b2MassDataMutableBuilder[Self <: b2MassData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: b2Vec2): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI(value: Double): Self = StObject.set(x, "I", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait b2PolygonShape extends b2Shape {
    
    /**
      * Get the edge normal vectors. There is one for each vertex.
      * @return List of edge normal vectors for each vertex.
      **/
    def GetNormals(): js.Array[b2Vec2] = js.native
    
    /**
      * Get the supporting vertex index in the given direction.
      * @param d Direction to look.
      * @return Vertex index supporting the direction.
      **/
    def GetSupport(d: b2Vec2): Double = js.native
    
    /**
      * Get the supporting vertex in the given direction.
      * @param d Direciton to look.
      * @return Vertex supporting the direction.
      **/
    def GetSupportVertex(d: b2Vec2): b2Vec2 = js.native
    
    /**
      * Get the vertex count.
      * @return Vertex count.
      **/
    def GetVertexCount(): Double = js.native
    
    /**
      * Get the vertices in local coordinates.
      * @return List of the vertices in local coordinates.
      **/
    def GetVertices(): js.Array[b2Vec2] = js.native
    
    /**
      * Copy vertices. This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
      * @param vertices List of vertices to create the polygon shape from.
      * @param vertexCount Number of vertices in the shape, default value is 0 and in the box2dweb.js code it is ignored.
      * @return Convex polygon shape.
      **/
    def SetAsArray(vertices: js.Array[b2Vec2]): Unit = js.native
    def SetAsArray(vertices: js.Array[b2Vec2], vertexCount: Double): Unit = js.native
    
    /**
      * Build vertices to represent an axis-aligned box.
      * @param hx The half-width.
      * @param hy The half-height.
      * @return Box polygon shape.
      **/
    def SetAsBox(hx: Double, hy: Double): Unit = js.native
    
    /**
      * Creates a single edge from two vertices.
      * @param v1 First vertex.
      * @param v2 Second vertex.
      * @return Edge polygon shape.
      **/
    def SetAsEdge(v1: b2Vec2, b2: b2Vec2): Unit = js.native
    
    /**
      * Build vertices to represent an oriented box.
      * @param hx The half-width.
      * @param hy The half-height.
      * @param center The center of the box in local coordinates, default is null (no center?)
      * @param angle The rotation of the box in local coordinates, default is 0.0.
      * @return Oriented box shape.
      **/
    def SetAsOrientedBox(hx: Double, hy: Double): Unit = js.native
    def SetAsOrientedBox(hx: Double, hy: Double, center: js.UndefOr[scala.Nothing], angle: Double): Unit = js.native
    def SetAsOrientedBox(hx: Double, hy: Double, center: b2Vec2): Unit = js.native
    def SetAsOrientedBox(hx: Double, hy: Double, center: b2Vec2, angle: Double): Unit = js.native
    
    /**
      * This assumes the vertices define a convex polygon.  It is assumed that the exterior is the the right of each edge.
      * @param vertices List of vertices to create the polygon shape from.
      * @param vertexCount The number of vertices, default is 0 and in the box2dweb.js code it is ignored.
      * @return Convex polygon shape.
      **/
    def SetAsVector(vertices: js.Array[_]): Unit = js.native
    def SetAsVector(vertices: js.Array[_], vertexCount: Double): Unit = js.native
  }
  
  @js.native
  trait b2Shape extends StObject {
    
    /**
      * Given a transform, compute the associated axis aligned bounding box for this shape.
      * @param aabb Calculated AABB, this argument is `out`.
      * @param xf Transform to calculate the AABB.
      **/
    def ComputeAABB(aabb: b2AABB, xf: b2Transform): Unit = js.native
    
    /**
      * Compute the mass properties of this shape using its dimensions and density. The inertia tensor is computed about the local origin, not the centroid.
      * @param massData Calculate the mass, this argument is `out`.
      * @param density Density.
      **/
    def ComputeMass(massData: b2MassData, density: Double): Unit = js.native
    
    /**
      * Compute the volume and centroid of this shape intersected with a half plane
      * @param normal The surface normal.
      * @param offset The surface offset along the normal.
      * @param xf The shape transform.
      * @param c The centroid, this argument is `out`.
      **/
    def ComputeSubmergedArea(normal: b2Vec2, offset: Double, xf: b2Transform, c: b2Vec2): Double = js.native
    
    /**
      * Clone the shape.
      **/
    def Copy(): b2Shape = js.native
    
    /**
      * Get the type of this shape. You can use this to down cast to the concrete shape.
      **/
    def GetType(): Double = js.native
    
    /**
      * Cast a ray against this shape.
      * @param output Ray cast results, this argument is `out`.
      * @param input Ray cast input parameters.
      * @param transform The transform to be applied to the shape.
      * @param return True if the ray hits the shape, otherwise false.
      **/
    def RayCast(output: b2RayCastOutput, input: b2RayCastInput, transform: b2Transform): Boolean = js.native
    
    /**
      * Set the shape values from another shape.
      * @param other The other shape to copy values from.
      **/
    def Set(other: b2Shape): Unit = js.native
    
    /**
      * Test a point for containment in this shape. This only works for convex shapes.
      * @param xf Shape world transform.
      * @param p Point to test against, in world coordinates.
      * @return True if the point is in this shape, otherwise false.
      **/
    def TestPoint(xf: b2Transform, p: b2Vec2): Boolean = js.native
  }
  object b2Shape {
    
    @scala.inline
    def apply(
      ComputeAABB: (b2AABB, b2Transform) => Unit,
      ComputeMass: (b2MassData, Double) => Unit,
      ComputeSubmergedArea: (b2Vec2, Double, b2Transform, b2Vec2) => Double,
      Copy: () => b2Shape,
      GetType: () => Double,
      RayCast: (b2RayCastOutput, b2RayCastInput, b2Transform) => Boolean,
      Set: b2Shape => Unit,
      TestPoint: (b2Transform, b2Vec2) => Boolean
    ): b2Shape = {
      val __obj = js.Dynamic.literal(ComputeAABB = js.Any.fromFunction2(ComputeAABB), ComputeMass = js.Any.fromFunction2(ComputeMass), ComputeSubmergedArea = js.Any.fromFunction4(ComputeSubmergedArea), Copy = js.Any.fromFunction0(Copy), GetType = js.Any.fromFunction0(GetType), RayCast = js.Any.fromFunction3(RayCast), Set = js.Any.fromFunction1(Set), TestPoint = js.Any.fromFunction2(TestPoint))
      __obj.asInstanceOf[b2Shape]
    }
    
    @scala.inline
    implicit class b2ShapeMutableBuilder[Self <: b2Shape] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputeAABB(value: (b2AABB, b2Transform) => Unit): Self = StObject.set(x, "ComputeAABB", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComputeMass(value: (b2MassData, Double) => Unit): Self = StObject.set(x, "ComputeMass", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComputeSubmergedArea(value: (b2Vec2, Double, b2Transform, b2Vec2) => Double): Self = StObject.set(x, "ComputeSubmergedArea", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCopy(value: () => b2Shape): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetType(value: () => Double): Self = StObject.set(x, "GetType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRayCast(value: (b2RayCastOutput, b2RayCastInput, b2Transform) => Boolean): Self = StObject.set(x, "RayCast", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSet(value: b2Shape => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTestPoint(value: (b2Transform, b2Vec2) => Boolean): Self = StObject.set(x, "TestPoint", js.Any.fromFunction2(value))
    }
  }
}
