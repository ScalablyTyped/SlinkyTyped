organization := "org.scalablytyped.slinky"
name := "react-native-vector-icons"
version := "6.4-dt-20200515Z-dad87f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-d1c111",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-7481b3",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-83112e",
  "org.scalablytyped.slinky" %%% "react-native" % "0.62-dt-20200515Z-5f2ef4",
  "org.scalablytyped.slinky" %%% "std" % "3.9-ad7699")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
