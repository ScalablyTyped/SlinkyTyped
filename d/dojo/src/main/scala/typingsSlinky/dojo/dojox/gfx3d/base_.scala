package typingsSlinky.dojo.dojox.gfx3d

import typingsSlinky.dojo.dojox.gfx3d.lighting.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.html
  *
  *
  */
@js.native
trait base_ extends js.Object {
  /**
    *
    */
  var defaultCube: js.Object = js.native
  /**
    *
    */
  var defaultCylinder: js.Object = js.native
  /**
    *
    */
  var defaultEdges: js.Object = js.native
  /**
    *
    */
  var defaultOrbit: js.Object = js.native
  /**
    *
    */
  var defaultPath3d: js.Object = js.native
  /**
    *
    */
  var defaultPolygon: js.Object = js.native
  /**
    *
    */
  var defaultQuads: js.Object = js.native
  /**
    *
    */
  var defaultTriangles: js.Object = js.native
  /**
    *
    */
  var drawer: js.Object = js.native
  /**
    *
    */
  var lighting: js.Object = js.native
  /**
    *
    */
  var matrix: js.Object = js.native
  /**
    *
    */
  var scheduler: js.Object = js.native
  /**
    *
    */
  var vector: js.Object = js.native
  /**
    *
    */
  def Cube(): Unit = js.native
  /**
    *
    */
  def Cylinder(): Unit = js.native
  /**
    *
    */
  def Edges(): Unit = js.native
  /**
    * a 3D matrix object
    * Normalizes a 3D matrix-like object. If arrays is passed,
    * all objects of the array are normalized and multiplied sequentially.
    *
    * @param arg a 3D matrix-like object, a number, or an array of such objects
    */
  def Matrix3D(arg: js.Object): Unit = js.native
  /**
    *
    */
  def Object(): Unit = js.native
  /**
    *
    */
  def Orbit(): Unit = js.native
  /**
    *
    */
  def Path3d(): Unit = js.native
  /**
    *
    */
  def Polygon(): Unit = js.native
  /**
    *
    */
  def Quads(): Unit = js.native
  /**
    *
    */
  def Scene(): Unit = js.native
  /**
    *
    */
  def Triangles(): Unit = js.native
  /**
    *
    */
  def Viewport(): Unit = js.native
  /**
    * calculate a cylindrical gradient
    *
    * @param model color model
    * @param material defines visual properties
    * @param center center of the cylinder's bottom
    * @param radius radius of the cylinder
    * @param from from position in radians
    * @param to from position in radians
    * @param matrix the cumulative transformation matrix
    */
  def gradient(
    model: Model,
    material: js.Object,
    center: js.Object,
    radius: Double,
    from: Double,
    to: Double,
    matrix: js.Object
  ): js.Object = js.native
}

object base_ {
  @scala.inline
  def apply(
    Cube: () => Unit,
    Cylinder: () => Unit,
    Edges: () => Unit,
    Matrix3D: js.Object => Unit,
    Object: () => Unit,
    Orbit: () => Unit,
    Path3d: () => Unit,
    Polygon: () => Unit,
    Quads: () => Unit,
    Scene: () => Unit,
    Triangles: () => Unit,
    Viewport: () => Unit,
    defaultCube: js.Object,
    defaultCylinder: js.Object,
    defaultEdges: js.Object,
    defaultOrbit: js.Object,
    defaultPath3d: js.Object,
    defaultPolygon: js.Object,
    defaultQuads: js.Object,
    defaultTriangles: js.Object,
    drawer: js.Object,
    gradient: (Model, js.Object, js.Object, Double, Double, Double, js.Object) => js.Object,
    lighting: js.Object,
    matrix: js.Object,
    scheduler: js.Object,
    vector: js.Object
  ): base_ = {
    val __obj = js.Dynamic.literal(Cube = js.Any.fromFunction0(Cube), Cylinder = js.Any.fromFunction0(Cylinder), Edges = js.Any.fromFunction0(Edges), Matrix3D = js.Any.fromFunction1(Matrix3D), Object = js.Any.fromFunction0(Object), Orbit = js.Any.fromFunction0(Orbit), Path3d = js.Any.fromFunction0(Path3d), Polygon = js.Any.fromFunction0(Polygon), Quads = js.Any.fromFunction0(Quads), Scene = js.Any.fromFunction0(Scene), Triangles = js.Any.fromFunction0(Triangles), Viewport = js.Any.fromFunction0(Viewport), defaultCube = defaultCube.asInstanceOf[js.Any], defaultCylinder = defaultCylinder.asInstanceOf[js.Any], defaultEdges = defaultEdges.asInstanceOf[js.Any], defaultOrbit = defaultOrbit.asInstanceOf[js.Any], defaultPath3d = defaultPath3d.asInstanceOf[js.Any], defaultPolygon = defaultPolygon.asInstanceOf[js.Any], defaultQuads = defaultQuads.asInstanceOf[js.Any], defaultTriangles = defaultTriangles.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], gradient = js.Any.fromFunction7(gradient), lighting = lighting.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], scheduler = scheduler.asInstanceOf[js.Any], vector = vector.asInstanceOf[js.Any])
    __obj.asInstanceOf[base_]
  }
  @scala.inline
  implicit class base_Ops[Self <: base_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCube(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cube")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCylinder(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cylinder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEdges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Edges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMatrix3D(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Matrix3D")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withObject(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Object")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOrbit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Orbit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPath3d(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Path3d")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPolygon(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Polygon")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQuads(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quads")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScene(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scene")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTriangles(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Triangles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withViewport(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Viewport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDefaultCube(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultCylinder(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCylinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultEdges(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultOrbit(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOrbit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPath3d(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPath3d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPolygon(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPolygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultQuads(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultQuads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTriangles(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTriangles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawer(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradient(value: (Model, js.Object, js.Object, Double, Double, Double, js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withLighting(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrix(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduler(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVector(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

