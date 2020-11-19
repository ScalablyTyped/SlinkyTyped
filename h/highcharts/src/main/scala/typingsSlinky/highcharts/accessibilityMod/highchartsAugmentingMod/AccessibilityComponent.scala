package typingsSlinky.highcharts.accessibilityMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The AccessibilityComponent base class, representing a part of the chart
  * that has accessibility logic connected to it. This class can be inherited
  * from to create a custom accessibility component for a chart.
  *
  * Components should take care to destroy added elements and unregister
  * event handlers on destroy. This is handled automatically if using
  * this.addEvent and this.createElement.
  */
@js.native
trait AccessibilityComponent extends js.Object
