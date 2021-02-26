organization := "org.scalablytyped.slinky"
name := "azure-arm-resource"
version := "7.4.0-b5f6bd"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "adal-node" % "0.2.1-fa67bd",
  "org.scalablytyped.slinky" %%% "ms-rest" % "2.5.4-bc0f7a",
  "org.scalablytyped.slinky" %%% "ms-rest-azure" % "2.6.0-498e4b",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
