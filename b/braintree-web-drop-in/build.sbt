organization := "org.scalablytyped.slinky"
name := "braintree-web-drop-in"
version := "1.22-dt-20201111Z-3fe4f4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "applepayjs" % "3.0-dt-20201106Z-c4fd65",
  "org.scalablytyped.slinky" %%% "braintree-web" % "3.62-dt-20200918Z-4fbcf8",
  "org.scalablytyped.slinky" %%% "googlepay" % "0.5-dt-20201030Z-b88a63",
  "org.scalablytyped.slinky" %%% "paypal-checkout-components" % "4.0-dt-20200828Z-f1f0c2",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
