package typingsSlinky.activexLibreoffice.com_.sun.star

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chart2 {
  /** @since LibreOffice 4.1 */
  type CartesianCoordinateSystem2d = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XCoordinateSystem
  /** @since LibreOffice 4.1 */
  type CartesianCoordinateSystem3d = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XCoordinateSystem
  /** A factory for creating ChartTypeTemplates. */
  type ChartTypeManager = typingsSlinky.activexLibreoffice.com_.sun.star.lang.MultiServiceFactory
  type ChartTypeTemplate = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XChartTypeTemplate
  /**
    * The service {@link CoordinateSystemType} represents a special type of coordinate system. For example a 2 dimensional Cartesian coordinate system is a
    * {@link CoordinateSystemType} and different from for example a 3 dimensional spherical coordinate system.
    *
    * A {@link CoordinateSystemType} is a stateless service which has no owner and does not enable cyclic references, thus its lifetime can be handled by
    * reference or it may be implemented as a singleton.
    */
  type CoordinateSystemType = js.Any
  type CoordinateSystemTypeID = java.lang.String
  /** @since LibreOffice 4.1 */
  type ExponentialRegressionCurve = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XRegressionCurve
  /**
    * {@link Scaling} that scales a value **x** by taking the power of the base to **x** .
    *
    * If not mentioned explicitly, the base for the power function is 10.0
    */
  type ExponentialScaling = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XScaling
  type FormattedString = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XFormattedString2
  /** @since LibreOffice 4.1 */
  type LinearRegressionCurve = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XRegressionCurve
  /**
    * {@link Scaling} that scales a value **x** by calculating **m  x + t** .
    *
    * If not mentioned explicitly, the parameter **m** is 1.0 and **t** is 0.0, which means the transformation is an identical mapping.
    */
  type LinearScaling = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XScaling
  /** @since LibreOffice 4.1 */
  type LogarithmicRegressionCurve = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XRegressionCurve
  /**
    * {@link Scaling} that scales values by taking their logarithm.
    *
    * If not mentioned explicitly, the base for the logarithm is 10.0
    */
  type LogarithmicScaling = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XScaling
  /** @since LibreOffice 4.1 */
  type MovingAverageRegressionCurve = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XRegressionCurve
  /** @since LibreOffice 4.1 */
  type PolarCoordinateSystem2d = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XCoordinateSystem
  /** @since LibreOffice 4.1 */
  type PolarCoordinateSystem3d = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XCoordinateSystem
  /** @since LibreOffice 4.1 */
  type PolynomialRegressionCurve = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XRegressionCurve
  /** @since LibreOffice 4.1 */
  type PotentialRegressionCurve = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XRegressionCurve
  /**
    * {@link Scaling} that scales a value **x** by taking the power of **x** to the exponent.
    *
    * If not mentioned explicitly, the exponent for the power function is 10.0
    */
  type PowerScaling = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XScaling
  /** @since LibreOffice 4.1 */
  type RegressionEquation = typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
  /** stateless service */
  type Scaling = typingsSlinky.activexLibreoffice.com_.sun.star.chart2.XScaling
  type XChartTypeManager = typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
  /** interface for the legend of a diagram */
  type XLegend = typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
}
