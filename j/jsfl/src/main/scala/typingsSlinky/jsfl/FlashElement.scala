package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.jsfl.FlashSymbolInstance because var conflicts: accName, actionScript, description, forceSimple, shortcut, silent, tabIndex. Inlined backgroundColor, bitmapRenderMode, blendMode, buttonTracking, cacheAsBitmap, colorAlphaAmount, colorAlphaPercent, colorBlueAmount, colorBluePercent, colorGreenAmount, colorGreenPercent, colorMode, colorRedAmount, colorRedPercent, filters, firstFrame, loop, symbolType, useBackgroundColor, visible */ @js.native
trait FlashElement
  extends FlashShape
     with FlashInstance
     with FlashBitmapInstance
     with FlashCompiledClipInstance
     with FlashComponentInstance {
  var backgroundColor: String = js.native
  var bitmapRenderMode: String = js.native
  var blendMode: String = js.native
  var buttonTracking: String = js.native
  var cacheAsBitmap: Boolean = js.native
  var colorAlphaAmount: Double = js.native
  var colorAlphaPercent: Double = js.native
  var colorBlueAmount: Double = js.native
  var colorBluePercent: Double = js.native
  var colorGreenAmount: Double = js.native
  var colorGreenPercent: Double = js.native
  var colorMode: String = js.native
  var colorRedAmount: Double = js.native
  var colorRedPercent: Double = js.native
  var depth: Double = js.native
  /**
  	 * Read-only property; a string that represents the type of the specified element.
  	 * The value is one of the following: "shape", "text", "instance", or "shapeObj".
  	 * A "shapeObj" is created with an extensible tool.
  	 */
  var elementType: String = js.native
  var filters: js.Array[FlashFilter] = js.native
  var firstFrame: Double = js.native
  var height: Double = js.native
  var layer: FlashLayer = js.native
  var left: Double = js.native
  var locked: Boolean = js.native
  var loop: String = js.native
  var matrix: FlashMatrix = js.native
  var name: String = js.native
  var rotation: Double = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var selected: Boolean = js.native
  var skewX: Double = js.native
  var skewY: Double = js.native
  var symbolType: String = js.native
  var top: Double = js.native
  var transformX: Double = js.native
  var transformY: Double = js.native
  var useBackgroundColor: Boolean = js.native
  var visible: Boolean = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def getPersistentData(name: String): js.Any = js.native
  def getTransformationPoint(): FlashPoint = js.native
  def hasPersistentData(name: String): Boolean = js.native
  def removePersistentData(name: String): Unit = js.native
  def setPersistentData(name: String, `type`: String, value: js.Any): Unit = js.native
  def setTransformationPoint(transformationPoint: FlashPoint): Unit = js.native
}

object FlashElement {
  @scala.inline
  def apply(
    accName: String,
    actionScript: String,
    backgroundColor: String,
    beginEdit: () => Unit,
    bitmapRenderMode: String,
    blendMode: String,
    buttonTracking: String,
    cacheAsBitmap: Boolean,
    closePath: Boolean,
    colorAlphaAmount: Double,
    colorAlphaPercent: Double,
    colorBlueAmount: Double,
    colorBluePercent: Double,
    colorGreenAmount: Double,
    colorGreenPercent: Double,
    colorMode: String,
    colorRedAmount: Double,
    colorRedPercent: Double,
    contours: js.Array[FlashContour],
    deleteEdge: Double => Unit,
    depth: Double,
    description: String,
    edges: js.Array[FlashEdge],
    elementType: String,
    endAngle: Double,
    endEdit: () => Unit,
    filters: js.Array[FlashFilter],
    firstFrame: Double,
    forceSimple: Boolean,
    getBits: () => FlashBitmap,
    getCubicSegmentPoints: Double => js.Array[FlashPoint],
    getPersistentData: String => js.Any,
    getTransformationPoint: () => FlashPoint,
    hPixels: Double,
    hasPersistentData: String => Boolean,
    height: Double,
    innerRadius: Double,
    isDrawingObject: Boolean,
    isGroup: Boolean,
    isOvalObject: Boolean,
    isRectangleObject: Boolean,
    layer: FlashLayer,
    left: Double,
    locked: Boolean,
    loop: String,
    matrix: FlashMatrix,
    members: js.Array[FlashShape],
    name: String,
    numCubicSegments: Double,
    parameters: js.Array[_],
    removePersistentData: String => Unit,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    selected: Boolean,
    setBits: FlashBitmap => Unit,
    setPersistentData: (String, String, js.Any) => Unit,
    setTransformationPoint: FlashPoint => Unit,
    shortcut: String,
    silent: Boolean,
    skewX: Double,
    skewY: Double,
    startAngle: Double,
    symbolType: String,
    tabIndex: Double,
    top: Double,
    transformX: Double,
    transformY: Double,
    useBackgroundColor: Boolean,
    vPixels: Double,
    vertices: js.Array[FlashVertex],
    visible: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): FlashElement = {
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], actionScript = actionScript.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], beginEdit = js.Any.fromFunction0(beginEdit), bitmapRenderMode = bitmapRenderMode.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], buttonTracking = buttonTracking.asInstanceOf[js.Any], cacheAsBitmap = cacheAsBitmap.asInstanceOf[js.Any], closePath = closePath.asInstanceOf[js.Any], colorAlphaAmount = colorAlphaAmount.asInstanceOf[js.Any], colorAlphaPercent = colorAlphaPercent.asInstanceOf[js.Any], colorBlueAmount = colorBlueAmount.asInstanceOf[js.Any], colorBluePercent = colorBluePercent.asInstanceOf[js.Any], colorGreenAmount = colorGreenAmount.asInstanceOf[js.Any], colorGreenPercent = colorGreenPercent.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], colorRedAmount = colorRedAmount.asInstanceOf[js.Any], colorRedPercent = colorRedPercent.asInstanceOf[js.Any], contours = contours.asInstanceOf[js.Any], deleteEdge = js.Any.fromFunction1(deleteEdge), depth = depth.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], endEdit = js.Any.fromFunction0(endEdit), filters = filters.asInstanceOf[js.Any], firstFrame = firstFrame.asInstanceOf[js.Any], forceSimple = forceSimple.asInstanceOf[js.Any], getBits = js.Any.fromFunction0(getBits), getCubicSegmentPoints = js.Any.fromFunction1(getCubicSegmentPoints), getPersistentData = js.Any.fromFunction1(getPersistentData), getTransformationPoint = js.Any.fromFunction0(getTransformationPoint), hPixels = hPixels.asInstanceOf[js.Any], hasPersistentData = js.Any.fromFunction1(hasPersistentData), height = height.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], isDrawingObject = isDrawingObject.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], isOvalObject = isOvalObject.asInstanceOf[js.Any], isRectangleObject = isRectangleObject.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numCubicSegments = numCubicSegments.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], removePersistentData = js.Any.fromFunction1(removePersistentData), rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], setBits = js.Any.fromFunction1(setBits), setPersistentData = js.Any.fromFunction3(setPersistentData), setTransformationPoint = js.Any.fromFunction1(setTransformationPoint), shortcut = shortcut.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transformX = transformX.asInstanceOf[js.Any], transformY = transformY.asInstanceOf[js.Any], useBackgroundColor = useBackgroundColor.asInstanceOf[js.Any], vPixels = vPixels.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashElement]
  }
  @scala.inline
  implicit class FlashElementOps[Self <: FlashElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBitmapRenderMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitmapRenderMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlendMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blendMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTracking(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheAsBitmap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheAsBitmap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorAlphaAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAlphaAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorAlphaPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAlphaPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorBlueAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBlueAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorBluePercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBluePercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorGreenAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorGreenAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorGreenPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorGreenPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorRedAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRedAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorRedPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRedPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[FlashFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstFrame(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPersistentData(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPersistentData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTransformationPoint(value: () => FlashPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransformationPoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasPersistentData(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPersistentData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayer(value: FlashLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrix(value: FlashMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovePersistentData(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removePersistentData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetPersistentData(value: (String, String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPersistentData")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetTransformationPoint(value: FlashPoint => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransformationPoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkewX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkewY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseBackgroundColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

