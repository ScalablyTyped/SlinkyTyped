organization := "org.scalablytyped.slinky"
name := "braintree-web-drop-in"
version := "1.22-dt-20201111Z-55332b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "applepayjs" % "3.0-dt-20201106Z-38545d",
  "org.scalablytyped.slinky" %%% "braintree-web" % "3.62-dt-20200918Z-8aaa57",
  "org.scalablytyped.slinky" %%% "googlepay" % "0.5-dt-20201030Z-c4127d",
  "org.scalablytyped.slinky" %%% "paypal-checkout-components" % "4.0-dt-20200828Z-17d5ef",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
