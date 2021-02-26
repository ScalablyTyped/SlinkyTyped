package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.FloatArray
import typingsSlinky.babylonjs.BABYLON.ICreateCapsuleOptions
import typingsSlinky.babylonjs.anon.AlignHorizontalAlignVertical
import typingsSlinky.babylonjs.anon.ArcBackUVs
import typingsSlinky.babylonjs.anon.BackUVsDepth
import typingsSlinky.babylonjs.anon.BackUVsDiameter
import typingsSlinky.babylonjs.anon.BackUVsFrontUVs
import typingsSlinky.babylonjs.anon.BbSize
import typingsSlinky.babylonjs.anon.ClosePath
import typingsSlinky.babylonjs.anon.DashNbDashSize
import typingsSlinky.babylonjs.anon.DiameterBottom
import typingsSlinky.babylonjs.anon.DiameterY
import typingsSlinky.babylonjs.anon.Lines
import typingsSlinky.babylonjs.anon.Precision
import typingsSlinky.babylonjs.anon.RadialSegments
import typingsSlinky.babylonjs.anon.RadiusZ
import typingsSlinky.babylonjs.anon.SizeY
import typingsSlinky.babylonjs.anon.Subdivisions
import typingsSlinky.babylonjs.anon.TileWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VertexData")
@js.native
class VertexData ()
  extends typingsSlinky.babylonjs.BABYLON.VertexData
/* static members */
object VertexData {
  
  @JSGlobal("BABYLON.VertexData")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Mesh side orientation : usually the internal or back surface
    */
  @JSGlobal("BABYLON.VertexData.BACKSIDE")
  @js.native
  val BACKSIDE: Double = js.native
  
  /**
    * Compute normals for given positions and indices
    * @param positions an array of vertex positions, [...., x, y, z, ......]
    * @param indices an array of indices in groups of three for each triangular facet, [...., i, j, k, ......]
    * @param normals an array of vertex normals, [...., x, y, z, ......]
    * @param options an object used to set the following optional parameters for the TorusKnot, optional
    * * facetNormals : optional array of facet normals (vector3)
    * * facetPositions : optional array of facet positions (vector3)
    * * facetPartitioning : optional partitioning array. facetPositions is required for facetPartitioning computation
    * * ratio : optional partitioning ratio / bounding box, required for facetPartitioning computation
    * * bInfo : optional bounding info, required for facetPartitioning computation
    * * bbSize : optional bounding box size data, required for facetPartitioning computation
    * * subDiv : optional partitioning data about subdivsions on  each axis (int), required for facetPartitioning computation
    * * useRightHandedSystem: optional boolean to for right handed system computation
    * * depthSort : optional boolean to enable the facet depth sort computation
    * * distanceTo : optional Vector3 to compute the facet depth from this location
    * * depthSortedFacets : optional array of depthSortedFacets to store the facet distances from the reference location
    */
  @JSGlobal("BABYLON.VertexData.ComputeNormals")
  @js.native
  def ComputeNormals(positions: js.Any, indices: js.Any, normals: js.Any): Unit = js.native
  @JSGlobal("BABYLON.VertexData.ComputeNormals")
  @js.native
  def ComputeNormals(positions: js.Any, indices: js.Any, normals: js.Any, options: BbSize): Unit = js.native
  
  /**
    * Creates the VertexData for a box
    * @param options an object used to set the following optional parameters for the box, required but can be empty
    * * size sets the width, height and depth of the box to the value of size, optional default 1
    * * width sets the width (x direction) of the box, overwrites the width set by size, optional, default size
    * * height sets the height (y direction) of the box, overwrites the height set by size, optional, default size
    * * depth sets the depth (z direction) of the box, overwrites the depth set by size, optional, default size
    * * faceUV an array of 6 Vector4 elements used to set different images to each box side
    * * faceColors an array of 6 Color3 elements used to set different colors to each box side
    * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the box
    */
  @JSGlobal("BABYLON.VertexData.CreateBox")
  @js.native
  def CreateBox(options: BackUVsDepth): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData for a Capsule, inspired from https://github.com/maximeq/three-js-capsule-geometry/blob/master/src/CapsuleBufferGeometry.js
    * @param options an object used to set the following optional parameters for the capsule, required but can be empty
    * @returns the VertexData of the Capsule
    */
  @JSGlobal("BABYLON.VertexData.CreateCapsule")
  @js.native
  def CreateCapsule(): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreateCapsule")
  @js.native
  def CreateCapsule(options: ICreateCapsuleOptions): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData for a cylinder, cone or prism
    * @param options an object used to set the following optional parameters for the box, required but can be empty
    * * height sets the height (y direction) of the cylinder, optional, default 2
    * * diameterTop sets the diameter of the top of the cone, overwrites diameter,  optional, default diameter
    * * diameterBottom sets the diameter of the bottom of the cone, overwrites diameter,  optional, default diameter
    * * diameter sets the diameter of the top and bottom of the cone, optional default 1
    * * tessellation the number of prism sides, 3 for a triangular prism, optional, default 24
    * * subdivisions` the number of rings along the cylinder height, optional, default 1
    * * arc a number from 0 to 1, to create an unclosed cylinder based on the fraction of the circumference given by the arc value, optional, default 1
    * * faceColors an array of Color3 elements used to set different colors to the top, rings and bottom respectively
    * * faceUV an array of Vector4 elements used to set different images to the top, rings and bottom respectively
    * * hasRings when true makes each subdivision independantly treated as a face for faceUV and faceColors, optional, default false
    * * enclose when true closes an open cylinder by adding extra flat faces between the height axis and vertical edges, think cut cake
    * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the cylinder, cone or prism
    */
  @JSGlobal("BABYLON.VertexData.CreateCylinder")
  @js.native
  def CreateCylinder(options: DiameterBottom): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Create the VertexData for a DashedLines
    * @param options an object used to set the following optional parameters for the DashedLines, required but can be empty
    *  - points an array successive Vector3
    *  - dashSize the size of the dashes relative to the dash number, optional, default 3
    *  - gapSize the size of the gap between two successive dashes relative to the dash number, optional, default 1
    *  - dashNb the intended total number of dashes, optional, default 200
    * @returns the VertexData for the DashedLines
    */
  @JSGlobal("BABYLON.VertexData.CreateDashedLines")
  @js.native
  def CreateDashedLines(options: DashNbDashSize): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData of the Disc or regular Polygon
    * @param options an object used to set the following optional parameters for the disc, required but can be empty
    * * radius the radius of the disc, optional default 0.5
    * * tessellation the number of polygon sides, optional, default 64
    * * arc a number from 0 to 1, to create an unclosed polygon based on the fraction of the circumference given by the arc value, optional, default 1
    * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the box
    */
  @JSGlobal("BABYLON.VertexData.CreateDisc")
  @js.native
  def CreateDisc(options: ArcBackUVs): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData for a Ground
    * @param options an object used to set the following optional parameters for the Ground, required but can be empty
    *  - width the width (x direction) of the ground, optional, default 1
    *  - height the height (z direction) of the ground, optional, default 1
    *  - subdivisions the number of subdivisions per side, optional, default 1
    * @returns the VertexData of the Ground
    */
  @JSGlobal("BABYLON.VertexData.CreateGround")
  @js.native
  def CreateGround(options: Subdivisions): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData of the Ground designed from a heightmap
    * @param options an object used to set the following parameters for the Ground, required and provided by MeshBuilder.CreateGroundFromHeightMap
    * * width the width (x direction) of the ground
    * * height the height (z direction) of the ground
    * * subdivisions the number of subdivisions per side
    * * minHeight the minimum altitude on the ground, optional, default 0
    * * maxHeight the maximum altitude on the ground, optional default 1
    * * colorFilter the filter to apply to the image pixel colors to compute the height, optional Color3, default (0.3, 0.59, 0.11)
    * * buffer the array holding the image color data
    * * bufferWidth the width of image
    * * bufferHeight the height of image
    * * alphaFilter Remove any data where the alpha channel is below this value, defaults 0 (all data visible)
    * @returns the VertexData of the Ground designed from a heightmap
    */
  @JSGlobal("BABYLON.VertexData.CreateGroundFromHeightMap")
  @js.native
  def CreateGroundFromHeightMap(options: typingsSlinky.babylonjs.anon.Buffer): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData of the IcoSphere
    * @param options an object used to set the following optional parameters for the IcoSphere, required but can be empty
    * * radius the radius of the IcoSphere, optional default 1
    * * radiusX allows stretching in the x direction, optional, default radius
    * * radiusY allows stretching in the y direction, optional, default radius
    * * radiusZ allows stretching in the z direction, optional, default radius
    * * flat when true creates a flat shaded mesh, optional, default true
    * * subdivisions increasing the subdivisions increases the number of faces, optional, default 4
    * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the IcoSphere
    */
  @JSGlobal("BABYLON.VertexData.CreateIcoSphere")
  @js.native
  def CreateIcoSphere(options: RadiusZ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData of the LineSystem
    * @param options an object used to set the following optional parameters for the LineSystem, required but can be empty
    *  - lines an array of lines, each line being an array of successive Vector3
    *  - colors an array of line colors, each of the line colors being an array of successive Color4, one per line point
    * @returns the VertexData of the LineSystem
    */
  @JSGlobal("BABYLON.VertexData.CreateLineSystem")
  @js.native
  def CreateLineSystem(options: Lines): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData for a Plane
    * @param options an object used to set the following optional parameters for the plane, required but can be empty
    * * size sets the width and height of the plane to the value of size, optional default 1
    * * width sets the width (x direction) of the plane, overwrites the width set by size, optional, default size
    * * height sets the height (y direction) of the plane, overwrites the height set by size, optional, default size
    * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the box
    */
  @JSGlobal("BABYLON.VertexData.CreatePlane")
  @js.native
  def CreatePlane(options: BackUVsFrontUVs): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData for an irregular Polygon in the XoZ plane using a mesh built by polygonTriangulation.build()
    * All parameters are provided by MeshBuilder.CreatePolygon as needed
    * @param polygon a mesh built from polygonTriangulation.build()
    * @param sideOrientation takes the values Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * @param fUV an array of Vector4 elements used to set different images to the top, rings and bottom respectively
    * @param fColors an array of Color3 elements used to set different colors to the top, rings and bottom respectively
    * @param frontUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * @param backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @param wrap a boolean, default false, when true and fUVs used texture is wrapped around all sides, when false texture is applied side
    * @returns the VertexData of the Polygon
    */
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(polygon: typingsSlinky.babylonjs.BABYLON.Mesh, sideOrientation: Double): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: js.UndefOr[scala.Nothing],
    backUVs: js.UndefOr[scala.Nothing],
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: js.UndefOr[scala.Nothing],
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: js.UndefOr[scala.Nothing],
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    backUVs: js.UndefOr[scala.Nothing],
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4]
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: js.UndefOr[scala.Nothing],
    backUVs: js.UndefOr[scala.Nothing],
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: js.UndefOr[scala.Nothing],
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: js.UndefOr[scala.Nothing],
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    backUVs: js.UndefOr[scala.Nothing],
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.UndefOr[scala.Nothing],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4]
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: js.UndefOr[scala.Nothing],
    backUVs: js.UndefOr[scala.Nothing],
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: js.UndefOr[scala.Nothing],
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: js.UndefOr[scala.Nothing],
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    backUVs: js.UndefOr[scala.Nothing],
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.UndefOr[scala.Nothing],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4]
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: js.UndefOr[scala.Nothing],
    backUVs: js.UndefOr[scala.Nothing],
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: js.UndefOr[scala.Nothing],
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: js.UndefOr[scala.Nothing],
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    backUVs: js.UndefOr[scala.Nothing],
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.CreatePolygon")
  @js.native
  def CreatePolygon(
    polygon: typingsSlinky.babylonjs.BABYLON.Mesh,
    sideOrientation: Double,
    fUV: js.Array[typingsSlinky.babylonjs.BABYLON.Vector4],
    fColors: js.Array[typingsSlinky.babylonjs.BABYLON.Color4],
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    wrap: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData for a Polyhedron
    * @param options an object used to set the following optional parameters for the polyhedron, required but can be empty
    * * type provided types are:
    *  * 0 : Tetrahedron, 1 : Octahedron, 2 : Dodecahedron, 3 : Icosahedron, 4 : Rhombicuboctahedron, 5 : Triangular Prism, 6 : Pentagonal Prism, 7 : Hexagonal Prism, 8 : Square Pyramid (J1)
    *  * 9 : Pentagonal Pyramid (J2), 10 : Triangular Dipyramid (J12), 11 : Pentagonal Dipyramid (J13), 12 : Elongated Square Dipyramid (J15), 13 : Elongated Pentagonal Dipyramid (J16), 14 : Elongated Pentagonal Cupola (J20)
    * * size the size of the IcoSphere, optional default 1
    * * sizeX allows stretching in the x direction, optional, default size
    * * sizeY allows stretching in the y direction, optional, default size
    * * sizeZ allows stretching in the z direction, optional, default size
    * * custom a number that overwrites the type to create from an extended set of polyhedron from https://www.babylonjs-playground.com/#21QRSK#15 with minimised editor
    * * faceUV an array of Vector4 elements used to set different images to the top, rings and bottom respectively
    * * faceColors an array of Color3 elements used to set different colors to the top, rings and bottom respectively
    * * flat when true creates a flat shaded mesh, optional, default true
    * * subdivisions increasing the subdivisions increases the number of faces, optional, default 4
    * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the Polyhedron
    */
  @JSGlobal("BABYLON.VertexData.CreatePolyhedron")
  @js.native
  def CreatePolyhedron(options: SizeY): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData for a Ribbon
    * @param options an object used to set the following optional parameters for the ribbon, required but can be empty
    * * pathArray array of paths, each of which an array of successive Vector3
    * * closeArray creates a seam between the first and the last paths of the pathArray, optional, default false
    * * closePath creates a seam between the first and the last points of each path of the path array, optional, default false
    * * offset a positive integer, only used when pathArray contains a single path (offset = 10 means the point 1 is joined to the point 11), default rounded half size of the pathArray length
    * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * * invertUV swaps in the U and V coordinates when applying a texture, optional, default false
    * * uvs a linear array, of length 2 * number of vertices, of custom UV values, optional
    * * colors a linear array, of length 4 * number of vertices, of custom color values, optional
    * @returns the VertexData of the ribbon
    */
  @JSGlobal("BABYLON.VertexData.CreateRibbon")
  @js.native
  def CreateRibbon(options: ClosePath): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData for an ellipsoid, defaults to a sphere
    * @param options an object used to set the following optional parameters for the box, required but can be empty
    * * segments sets the number of horizontal strips optional, default 32
    * * diameter sets the axes dimensions, diameterX, diameterY and diameterZ to the value of diameter, optional default 1
    * * diameterX sets the diameterX (x direction) of the ellipsoid, overwrites the diameterX set by diameter, optional, default diameter
    * * diameterY sets the diameterY (y direction) of the ellipsoid, overwrites the diameterY set by diameter, optional, default diameter
    * * diameterZ sets the diameterZ (z direction) of the ellipsoid, overwrites the diameterZ set by diameter, optional, default diameter
    * * arc a number from 0 to 1, to create an unclosed ellipsoid based on the fraction of the circumference (latitude) given by the arc value, optional, default 1
    * * slice a number from 0 to 1, to create an unclosed ellipsoid based on the fraction of the height (latitude) given by the arc value, optional, default 1
    * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the ellipsoid
    */
  @JSGlobal("BABYLON.VertexData.CreateSphere")
  @js.native
  def CreateSphere(options: DiameterY): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData for a tiled box
    * @param options an object used to set the following optional parameters for the box, required but can be empty
    * * faceTiles sets the pattern, tile size and number of tiles for a face
    * * faceUV an array of 6 Vector4 elements used to set different images to each box side
    * * faceColors an array of 6 Color3 elements used to set different colors to each box side
    * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * @returns the VertexData of the box
    */
  @JSGlobal("BABYLON.VertexData.CreateTiledBox")
  @js.native
  def CreateTiledBox(options: TileWidth): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData for a TiledGround by subdividing the ground into tiles
    * @param options an object used to set the following optional parameters for the Ground, required but can be empty
    * * xmin the ground minimum X coordinate, optional, default -1
    * * zmin the ground minimum Z coordinate, optional, default -1
    * * xmax the ground maximum X coordinate, optional, default 1
    * * zmax the ground maximum Z coordinate, optional, default 1
    * * subdivisions a javascript object {w: positive integer, h: positive integer}, `w` and `h` are the numbers of subdivisions on the ground width and height creating 'tiles', default {w: 6, h: 6}
    * * precision a javascript object {w: positive integer, h: positive integer}, `w` and `h` are the numbers of subdivisions on the tile width and height, default {w: 2, h: 2}
    * @returns the VertexData of the TiledGround
    */
  @JSGlobal("BABYLON.VertexData.CreateTiledGround")
  @js.native
  def CreateTiledGround(options: Precision): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData for a tiled plane
    * @param options an object used to set the following optional parameters for the box, required but can be empty
    * * pattern a limited pattern arrangement depending on the number
    * * tileSize sets the width, height and depth of the tile to the value of size, optional default 1
    * * tileWidth sets the width (x direction) of the tile, overwrites the width set by size, optional, default size
    * * tileHeight sets the height (y direction) of the tile, overwrites the height set by size, optional, default size
    * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the tiled plane
    */
  @JSGlobal("BABYLON.VertexData.CreateTiledPlane")
  @js.native
  def CreateTiledPlane(options: AlignHorizontalAlignVertical): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData for a torus
    * @param options an object used to set the following optional parameters for the box, required but can be empty
    * * diameter the diameter of the torus, optional default 1
    * * thickness the diameter of the tube forming the torus, optional default 0.5
    * * tessellation the number of prism sides, 3 for a triangular prism, optional, default 24
    * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the torus
    */
  @JSGlobal("BABYLON.VertexData.CreateTorus")
  @js.native
  def CreateTorus(options: BackUVsDiameter): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Creates the VertexData for a TorusKnot
    * @param options an object used to set the following optional parameters for the TorusKnot, required but can be empty
    * * radius the radius of the torus knot, optional, default 2
    * * tube the thickness of the tube, optional, default 0.5
    * * radialSegments the number of sides on each tube segments, optional, default 32
    * * tubularSegments the number of tubes to decompose the knot into, optional, default 32
    * * p the number of windings around the z axis, optional,  default 2
    * * q the number of windings around the x axis, optional,  default 3
    * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the Torus Knot
    */
  @JSGlobal("BABYLON.VertexData.CreateTorusKnot")
  @js.native
  def CreateTorusKnot(options: RadialSegments): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Mesh side orientation : by default, `FRONTSIDE`
    */
  @JSGlobal("BABYLON.VertexData.DEFAULTSIDE")
  @js.native
  val DEFAULTSIDE: Double = js.native
  
  /**
    * Mesh side orientation : both internal and external or front and back surfaces
    */
  @JSGlobal("BABYLON.VertexData.DOUBLESIDE")
  @js.native
  val DOUBLESIDE: Double = js.native
  
  /**
    * Extracts the vertexData from the geometry
    * @param geometry the geometry from which to extract the VertexData
    * @param copyWhenShared defines if the VertexData must be cloned when the geometrty is shared between multiple meshes, optional, default false
    * @param forceCopy indicating that the VertexData must be cloned, optional, default false
    * @returns the object VertexData associated to the passed mesh
    */
  @JSGlobal("BABYLON.VertexData.ExtractFromGeometry")
  @js.native
  def ExtractFromGeometry(geometry: typingsSlinky.babylonjs.BABYLON.Geometry): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.ExtractFromGeometry")
  @js.native
  def ExtractFromGeometry(
    geometry: typingsSlinky.babylonjs.BABYLON.Geometry,
    copyWhenShared: js.UndefOr[scala.Nothing],
    forceCopy: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.ExtractFromGeometry")
  @js.native
  def ExtractFromGeometry(geometry: typingsSlinky.babylonjs.BABYLON.Geometry, copyWhenShared: Boolean): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.ExtractFromGeometry")
  @js.native
  def ExtractFromGeometry(geometry: typingsSlinky.babylonjs.BABYLON.Geometry, copyWhenShared: Boolean, forceCopy: Boolean): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Extracts the vertexData from a mesh
    * @param mesh the mesh from which to extract the VertexData
    * @param copyWhenShared defines if the VertexData must be cloned when shared between multiple meshes, optional, default false
    * @param forceCopy indicating that the VertexData must be cloned, optional, default false
    * @returns the object VertexData associated to the passed mesh
    */
  @JSGlobal("BABYLON.VertexData.ExtractFromMesh")
  @js.native
  def ExtractFromMesh(mesh: typingsSlinky.babylonjs.BABYLON.Mesh): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.ExtractFromMesh")
  @js.native
  def ExtractFromMesh(
    mesh: typingsSlinky.babylonjs.BABYLON.Mesh,
    copyWhenShared: js.UndefOr[scala.Nothing],
    forceCopy: Boolean
  ): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.ExtractFromMesh")
  @js.native
  def ExtractFromMesh(mesh: typingsSlinky.babylonjs.BABYLON.Mesh, copyWhenShared: Boolean): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  @JSGlobal("BABYLON.VertexData.ExtractFromMesh")
  @js.native
  def ExtractFromMesh(mesh: typingsSlinky.babylonjs.BABYLON.Mesh, copyWhenShared: Boolean, forceCopy: Boolean): typingsSlinky.babylonjs.BABYLON.VertexData = js.native
  
  /**
    * Mesh side orientation : usually the external or front surface
    */
  @JSGlobal("BABYLON.VertexData.FRONTSIDE")
  @js.native
  val FRONTSIDE: Double = js.native
  
  /**
    * Applies VertexData created from the imported parameters to the geometry
    * @param parsedVertexData the parsed data from an imported file
    * @param geometry the geometry to apply the VertexData to
    */
  @JSGlobal("BABYLON.VertexData.ImportVertexData")
  @js.native
  def ImportVertexData(parsedVertexData: js.Any, geometry: typingsSlinky.babylonjs.BABYLON.Geometry): Unit = js.native
  
  /** @hidden */
  @JSGlobal("BABYLON.VertexData._ComputeSides")
  @js.native
  def _ComputeSides(
    sideOrientation: Double,
    positions: FloatArray,
    indices: FloatArray,
    normals: FloatArray,
    uvs: FloatArray
  ): Unit = js.native
  @JSGlobal("BABYLON.VertexData._ComputeSides")
  @js.native
  def _ComputeSides(
    sideOrientation: Double,
    positions: FloatArray,
    indices: FloatArray,
    normals: FloatArray,
    uvs: FloatArray,
    frontUVs: js.UndefOr[scala.Nothing],
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): Unit = js.native
  @JSGlobal("BABYLON.VertexData._ComputeSides")
  @js.native
  def _ComputeSides(
    sideOrientation: Double,
    positions: FloatArray,
    indices: FloatArray,
    normals: FloatArray,
    uvs: FloatArray,
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): Unit = js.native
  @JSGlobal("BABYLON.VertexData._ComputeSides")
  @js.native
  def _ComputeSides(
    sideOrientation: Double,
    positions: FloatArray,
    indices: FloatArray,
    normals: FloatArray,
    uvs: FloatArray,
    frontUVs: typingsSlinky.babylonjs.BABYLON.Vector4,
    backUVs: typingsSlinky.babylonjs.BABYLON.Vector4
  ): Unit = js.native
  
  @JSGlobal("BABYLON.VertexData._ExtractFrom")
  @js.native
  def _ExtractFrom: js.Any = js.native
  @scala.inline
  def _ExtractFrom_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ExtractFrom")(x.asInstanceOf[js.Any])
}
